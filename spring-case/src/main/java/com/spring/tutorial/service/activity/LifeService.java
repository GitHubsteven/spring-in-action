package com.spring.tutorial.service.activity;

import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:30 2018/4/5.
 */
@Component
public class LifeService {
    private HelloService helloService;

    public LifeService(){
    }

    public LifeService(String message){
        System.out.println(message);
    }

    public void life(){
        System.out.println("hello, life");
    }
    public void tellStatus() {
        System.out.println("I am in life status, no work, no study ...");
    }
}
