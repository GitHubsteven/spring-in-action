package com.spring.tutorial.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseSpringApp {
    public static ApplicationContext getContext() {
        return new ClassPathXmlApplicationContext("conf/Beans.xml");
    }
}
