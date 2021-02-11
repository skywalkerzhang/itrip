package org.hzdb.auth.controller;


import org.hzdb.auth.UserBean;
import org.hzdb.auth.service.UserService;
import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.util.DtoUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.*;
/**
 *
 *      XxxxxxSupport   SqlSessionDaoSupport
 *                              内聚
 *      XxxxxxTemplate  SqlSessionTemplate
 */
import javax.annotation.Resource;

@RestController
@RequestMapping("/api/")
public class UserController {

        @Resource
        private StringRedisTemplate stringRedisTemplate;

        @Resource
        private UserService userService;

        @PutMapping("activate")
       public OutDto activeUser(String user,String code){
           // redis中判断是否有key  有就需要 ， 没有  没有注册或者已经激活
            // 根据用户名查询指定用户   结果2  1已经激活。 2 没 正常业务
           // 激活成功  清除验证码
           return userService.activeUser(user,code);
       }


    /**
     * 判断用户是否已经注册
     * @param name
     * @return
     */
    @GetMapping("ckusr")
        public OutDto isExist(String name){

        return userService.checkUser(name);
            //return DtoUtil.getSuccessDto("可以允许注册");
        }


    /**
     *  手机注册  邮箱注册
     * @return
     */
    @PostMapping({"registerbyphone","doregister"})
    public OutDto sjzhuce(@RequestBody UserBean userBean){
            // 添加到数据库
            //1 缓存是否已经有了这个KEY 已经被人注册了
        if (stringRedisTemplate.hasKey(userBean.getUserCode())) {
            return DtoUtil.getErrorDto("用户已经存在","1500001");
        }

        return userService.regedit(userBean.getUserCode(),userBean.getUserName(),userBean.getUserPassword());

        }




        @PostMapping("dologin")
        public OutDto login(String name, String password , Device device){
            System.out.println("name is "+name +",password is "+password);
            String deviceName = "PC";
            if(!device.isNormal()){
                deviceName="MOBILE";
            }
            System.out.println("用户请求的设备是："+deviceName);
          return userService.selectByLogin(name,password,deviceName);
        }

        @GetMapping("logout")
        public OutDto logout(@RequestHeader("token") String token ){
            System.out.println("口令是 : "+ token);
            return userService.logout(token);
        }


        @PostMapping("retoken")
        public OutDto retoken(@RequestHeader("token") String token ){
            System.out.println("口令是 : "+ token);
            return userService.retoken(token);
        }

}
