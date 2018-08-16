package com.spring.tutorial.repeat.scene.instant;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 17:08
 * @Description:
 * @version: 1.0.0
 */
public class Children extends Parent {
    private static String childStaticField = getSubStaticField();

    static {
        System.out.println("==child static code block");
    }

    {
        System.out.println("==child common code block");
    }

    public Children() {
        System.out.println("===child constructor");
    }

    public static String getSubStaticField() {
        System.out.println("===instant child static field.....");
        return "";
    }
}