package com.spring.tutorial.app;

import com.spring.tutorial.parentInXml.HelloUK;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ParentMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/Beans.xml");
//        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//        objA.getMessage1();
//        objA.getMessage2();

//        HelloIndia helloIndia = context.getBean(HelloIndia.class);
//        helloIndia.getMessage1();
//        helloIndia.getMessage2();
//        helloIndia.getMessage3();

        HelloUK helloUK = (HelloUK) context.getBean("helloUK");
        helloUK.getMessage1();
        helloUK.getMessage2();
        helloUK.getMessage3();

    }

}
