package com.spring.tutorial.service.activity;

import org.springframework.stereotype.Service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 22:33 2018/4/3.
 */
@Service("helloService")
public class HelloService {
    private String message;

    public void hello(){
        System.out.println("hello ...");
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    HelloService() {
//        System.out.println("construct method is conducting...");
    }

    public void init() {
        System.out.println("helloService is init...");
    }

    public void destroy() {
        System.out.println("helloService is to be destroy...");
    }
}
