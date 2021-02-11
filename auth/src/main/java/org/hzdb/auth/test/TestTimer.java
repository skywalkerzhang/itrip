package org.hzdb.auth.test;

import java.util.Timer;
import java.util.TimerTask;
class Mytt extends TimerTask{

    @Override  // Quartz
    public void run() {
        System.out.println("每个月最后一天要执行的任务。。。");
    }
}

public class TestTimer {

    public static void main(String[] args) throws InterruptedException {
        Timer timer=new Timer();//多张程

        timer.schedule(new Mytt(),5000);//5月15
        for(int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("另一个操作，不影响");
        }
        timer.cancel();

    }

}
