package org.hzdb.search;

import org.hzdb.search.service.SolrService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSolr {
    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");

        SolrService ss=  ac.getBean(SolrService.class);

        ss.getHotelListByHotCity(2);



    }

}
