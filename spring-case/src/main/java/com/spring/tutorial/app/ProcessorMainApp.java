package com.spring.tutorial.app;

import com.spring.tutorial.service.HelloService;
import com.spring.tutorial.service.LifeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:42 2018/4/5.
 */
public class ProcessorMainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("conf/Beans.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.getMessage();

        LifeService lifeService = (LifeService) context.getBean("lifeService");
        lifeService.tellStatus();
        //        This will ensures a graceful shutdown and calls the relevant destroy methods.
        context.registerShutdownHook();
    }
}
