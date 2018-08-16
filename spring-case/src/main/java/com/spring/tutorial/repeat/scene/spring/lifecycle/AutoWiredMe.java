package com.spring.tutorial.repeat.scene.spring.lifecycle;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 19:42
 * @Description:
 * @version: 1.0.0
 */
@Component
public class AutoWiredMe {
    AutoWiredMe() {
        System.out.println("----AutoWiredMe: constructor");
    }

    public void whoIam(){
        System.out.println("AutowiredMe: who i am ??????");
    }
}