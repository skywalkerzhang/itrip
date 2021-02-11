package org.hzdb.auth.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {

        //每隔半小时执行  改状态

        @Scheduled(cron = "0 * * * * *")
        public void show(){
            System.out.println("show 方法 ：查询数据库信息，根据业务进行修改数据库操作。。" +
                    "");
        }
        //每天中午12点执行 退房间
        public void show2(){
            System.out.println("查询数据库信息，根据业务进行修改数据库操作。。" +
                    "");
        }

}
