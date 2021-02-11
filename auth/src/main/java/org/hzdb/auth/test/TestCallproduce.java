package org.hzdb.auth.test;

import org.hzdb.mapper.ItripUserMapper;
import org.hzdb.pojo.StroeVo.StoreVo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

public class TestCallproduce {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");



        Thread.sleep(1000000);









//        ItripUserMapper im=  ac.getBean(ItripUserMapper.class);
//        StoreVo vo = new StoreVo();
//        vo.setCheckInDate(new Date(System.currentTimeMillis()));
//        vo.setCheckOutDate(new Date(System.currentTimeMillis()+5*24*60*60*1000));
//        vo.setHotelId(1L);
//        vo.setRoomId(1L);
//        im.callProcude(vo);
        //# 查询指定房间在指定日期范围内的库存信息

        //#  19 19 19 18 18  19   20 20 20 20  ..
        //   18   List     min()



    }

}
