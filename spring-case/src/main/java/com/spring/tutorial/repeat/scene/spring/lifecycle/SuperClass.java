package com.spring.tutorial.repeat.scene.spring.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
public class SuperClass {
    private static String staticField = getStaticField();
    private String commonField = this.setCommonField();

    SuperClass(String note) {
        System.out.println("---parent: constructor " + note);
    }

    static {
        System.out.println("---parent: static code block");
    }

    {
        System.out.println("---parent: common code block");
    }

    SuperClass() {
        System.out.println("---parent: constructor");
    }

    @PostConstruct
    public void postCon() {
        System.out.println("---parent: postConstructor");
    }

    @Autowired
    public void configMethod() {
        System.out.println("---parent: autowired config method!");
    }

    private static String getStaticField() {
        System.out.println("---parent: init static field");
        return "---staticField";
    }

    public void commonMethod() {
        System.out.println("---parent: common method");
    }

    public String setCommonField() {
        System.out.println("---parent: common field");
        return "";
    }
}