package com.spring.tutorial.di.constructor_based;

public class MoreParamDI {
    private String name;
    private int age;

    MoreParamDI(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void introduce() {
        System.out.println("hell, I am:" + this.name + "and " + this.age + "old");
    }
}
