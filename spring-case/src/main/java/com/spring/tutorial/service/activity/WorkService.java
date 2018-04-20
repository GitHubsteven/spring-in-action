package com.spring.tutorial.service.activity;

import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:30 2018/4/5.
 */
@Component
public class WorkService {
    public void startWork(){
        System.out.println("work start ...");
    }

    public void endWork(){
        System.out.println("work end ...");
    }
}
