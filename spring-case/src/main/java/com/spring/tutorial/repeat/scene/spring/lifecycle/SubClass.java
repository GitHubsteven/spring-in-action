package com.spring.tutorial.repeat.scene.spring.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 19:02
 * @Description:
 * @version: 1.0.0
 */
@Component
public class SubClass extends SuperClass {
    private static String subStaticField = getSubStaticField();
    private String subCommonField = this.setSubCommonField();


    static {
        System.out.println("***sub: static code block");
    }

    {
        System.out.println("***sub: common code block");
    }

    SubClass() {
        super("***sub");
        System.out.println("***sub: constructor");
    }

    @PostConstruct
    public void postSubCon() {
        System.out.println("***sub: postConstructor");
    }

    @Autowired
    public void subConfigMethod() {
        System.out.println("***sub: autowired config method!");
    }

    private static String getSubStaticField() {
        System.out.println("***sub: init static field");
        return "staticField";
    }

    public void subCommonMethod() {
        System.out.println("***sub: common method");
    }

    public String setSubCommonField() {
        System.out.println("***sub: common field");
        return "";
    }
}