package org.hzdb.biz.vo;

import org.hzdb.biz.service.HotelOrderService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrderSelect {

        @Test
        public void t1(){
                ApplicationContext ac =new ClassPathXmlApplicationContext("spring.xml");
                HotelOrderService ho= ac.getBean(HotelOrderService.class);
                OrderVo vo=new OrderVo();
                vo.setOrderStatus(1);
                vo.setOrderType(1);
                vo.setPageNo(2);
                vo.setPageSize(6);
                ho.findOrderByQuery(vo);

        }

}
