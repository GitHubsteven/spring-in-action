package com.spring.tutorial.app;

import com.spring.tutorial.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 22:33 2018/4/3.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/Beans.xml");
        HelloService objA = (HelloService) context.getBean("helloService");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloService objB = (HelloService) context.getBean("helloService");
        objB.getMessage();
    }
}
