package org.hzdb.auth.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.hzdb.auth.service.UserService;
import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.beans.pojo.entity.ItripUser;
import org.hzdb.beans.pojo.vo.Token;
import org.hzdb.contans.PhoneContans;
import org.hzdb.mapper.ItripUserMapper;
import org.hzdb.util.*;
import org.omg.CORBA.TIMEOUT;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private ItripUserMapper itripUserMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private PhoneTemplate phoneTemplate;

    @Resource
    private JavaMailSender javaMailSender;

    @Resource
    private SimpleMailMessage simpleMailMessage;

    public UserServiceImpl() {
    }



















































    @Override
    public OutDto selectByLogin(String name, String password,String src) {
        // v如果用户已经登录过，就不处理

        QueryWrapper<ItripUser> wrapper=new QueryWrapper<>();
        wrapper.eq("usercode",name);
         wrapper.eq("userpassword",Md5Utils.enctypeCode(password));

         ItripUser user=  itripUserMapper.selectOne(wrapper);
        //  用户如果登录成功 ：
        // 取代session 的token设置 格式 ：　[token:来源-用户信息加密-用户ID-随机机器码-时间戳 ]
        // 设置token 的操作  添加  修改 删除  查询
        // 在redis中保存token信息 ，token 是key  ,值 是 用户对象的json序列化信息
        if(user!=null) {
            Token token = TokenUtil.getToke(user,src);
            stringRedisTemplate.opsForValue().set(token.getToken(),
                    JSONObject.toJSONString(user),
                    src.equals("PC")?7200:Long.MAX_VALUE,
                    TimeUnit.SECONDS);
            return DtoUtil.getSuccessWithData("登录成功",token);
        }else{
            return DtoUtil.getErrorDto("用户名密码不正确","1000006");

        }

    }

    public boolean isExists(String usercode){
        return itripUserMapper.selectCount(new QueryWrapper<ItripUser>().eq("usercode",usercode))>0;
    }


    @Override
    public OutDto regedit(String userCode, String userName, String userPassword) {
        //如果已经在数据库存在这个用户名，不能注册
        if (isExists(userCode)) {
            return DtoUtil.getErrorDto("用户已经存在","1500001");
        }
        ItripUser user =new ItripUser();
        user.setUsercode(userCode);
        user.setUsername(userName);

        //密码  对称加密   非对称加密 解密难 安全   md5
        user.setUserpassword(Md5Utils.enctypeCode(userPassword));
        user.setActivated(0);
        Random r=new Random();
        int row = itripUserMapper.insert(user);
        OutDto dto = new OutDto();


        if(row>0) {
            //生成验证码。 4位数字  1234  2分钟有效  18395945990
            int code = r.nextInt(9000)+1000;
            //redis服务器要保存一份验证码
           //发送手机验证码给用户。。。
            int ttl=2;
            if(userCode.contains("@")){
                ttl=1440;
                simpleMailMessage.setTo(userCode);

                simpleMailMessage.setText("欢迎注册爱旅行，这是激活邮件，请在24小时内激活。你的激活是："+code);
                javaMailSender.send(simpleMailMessage);
            }else {
                phoneTemplate.sendTemplateSMS(userCode, "1", new String[]{code + "", PhoneContans.TTL_TIME_VALID_CODE});
            }
            stringRedisTemplate.opsForValue().set(userCode,code+"",ttl, TimeUnit.MINUTES);

            return DtoUtil.getSuccessDto("用户注册成功，激活码已经发送，请尽快激活");
        }else{
           return DtoUtil.getErrorDto("用户已经存在","1500003");
        }
    }

    @Override
    public OutDto activeUser(String user, String code) {

        if (!stringRedisTemplate.hasKey(user)) {
            return DtoUtil.getErrorDto("没有注册或者已经激活成功","160004");
        }
        if (!isExists(user)) {
            return DtoUtil.getErrorDto("用户不存在","1500002");
        }
        ItripUser itripUser = itripUserMapper.selectOne(new QueryWrapper<ItripUser>().eq("usercode",user));
        if (itripUser.getActivated()==1) {
            return DtoUtil.getErrorDto("用户已经激活，无须激活","1500002");
        }

        if(!stringRedisTemplate.opsForValue().get(user).equals(code)){
            return DtoUtil.getErrorDto("用户激活码不正确，无须激活","1500002");

        }

        itripUser.setActivated(1);
        if (itripUserMapper.updateById(itripUser)>0) {
            stringRedisTemplate.delete(user);
            return DtoUtil.getSuccessDto("激活成功，请登录");
        }

        return DtoUtil.getErrorDto("未知情况不成功","1500003");
    }

    @Override
    public OutDto checkUser(String name) {
        if(isExists(name)){
            return DtoUtil.getErrorDto("已经存在，换个注册","10005");
        }else{
            return DtoUtil.getSuccessDto("可以注册");
        }

    }

    @Override
    public OutDto logout(String token) {
        //根据用户提交的token进行注销操作：
        // 删除redis中的对应数据。


        if (!stringRedisTemplate.hasKey(token)) {
            return DtoUtil.getErrorDto("用户不存在或者已经注销了","100556");
        }
        ItripUser user= JSONObject.parseObject(stringRedisTemplate.opsForValue().get(token),ItripUser.class);

        if(user!=null&!token.split("-")[2].equals(user.getId().toString())){
            return DtoUtil.getErrorDto("用户存在,但口令不正确","100556");

        }


        stringRedisTemplate.delete(token);
        //省略数据库操作

        return DtoUtil.getSuccessDto("注销成功欢迎下次再来");

    }

    @Override
    public OutDto retoken(String token) {
    /*
    1 判断token  是否存在
            2 判断token  是否到了临界点
            3 产生一个新的token ,替换掉老的
                                    1 删除老的（）自动过期
                                    2 在老的上面做修改过期时间
oken:PC-e93969dd3911fc698459a4e5aef5799d-
1289127595555762177-f91b49-20200803160908
     */

        if (!stringRedisTemplate.hasKey(token)) {
            return DtoUtil.getErrorDto("用户不存在或者已经注销了，不需要置换token","100556");
        }
        String [] tokens = token.split("-");
        if (tokens[0].endsWith("MOBILE")) {
            return DtoUtil.getErrorDto("移动端不需要置换token","100556");

        }


        ItripUser user= JSONObject.parseObject(stringRedisTemplate.opsForValue().get(token),ItripUser.class);
       //快接近5分钟重置2020 8 3 16 35 31          2020 8 3 16 40
        if (DateUtil.getDateByString(tokens[4]).getTime()+2*60*60*1000-5*60*1000>System.currentTimeMillis()) {
            return DtoUtil.getErrorDto("时间还早，不需要替换","100556");
        }

        Token tk=  TokenUtil.getToke(user,"PC");
        //添加一个新的token
        stringRedisTemplate.opsForValue().set(tk.getToken(),JSONObject.toJSONString(user),2,TimeUnit.HOURS);
        //老的token进行延期
        stringRedisTemplate.expire(token,5, TimeUnit.MINUTES);


        return DtoUtil.getSuccessWithData("置换成功",tk);
    }
}
