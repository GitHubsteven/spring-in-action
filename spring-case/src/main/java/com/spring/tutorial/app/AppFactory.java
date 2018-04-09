package com.spring.tutorial.app;

import com.spring.tutorial.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 21:25 2018/4/9.
 */
public class AppFactory {
    public static ApplicationContext getJdbcApp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/conf/jdbc.xml");
        return context;
    }

    public static ApplicationContext getJdbcAnnApp() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        return context;
    }
}
