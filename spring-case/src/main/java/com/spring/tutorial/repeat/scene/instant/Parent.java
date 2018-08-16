package com.spring.tutorial.repeat.scene.instant;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 16:56
 * @Description:
 * @version: 1.0.0
 */
public class Parent {
    private static String staticField = getStaticField();

    static {
        System.out.println("parent static code block");
    }

    {
        System.out.println("parent common code block");
    }

    public Parent() {
        System.out.println("parent constructor");
    }

    public static String getStaticField() {
        System.out.println("instant parent static field.....");
        return "";
    }
}