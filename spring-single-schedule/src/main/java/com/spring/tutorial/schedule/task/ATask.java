package com.spring.tutorial.schedule.task;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

@Component
public class ATask {
//    @Scheduled(cron = "0/10 * * * * ? ") //每10秒执行一次
    public void aTask() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(DateTime.now().toDate()) + "*********A任务每10秒执行一次进入测试");
    }
}  