package com.spring.tutorial.app;

import com.spring.tutorial.configure.SpringConfiguration;
import com.spring.tutorial.service.manage.JobManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:42 2018/4/5.
 */
public class AnnMainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // TODO: 2018/4/20 开始测试所有的声明吧
        JobManager jobManager = context.getBean(JobManager.class);
//        jobManager.checkTeacher();
        jobManager.introduceJob();
    }
}
