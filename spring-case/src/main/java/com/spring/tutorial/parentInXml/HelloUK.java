package com.spring.tutorial.parentInXml;

import org.springframework.stereotype.Component;

@Component
public class HelloUK {
    private String message1;
    private String message2;
    private String message3;

    public String getMessage1() {
        System.out.println(message1);
        return message1;
    }

    public HelloUK setMessage1(String message1) {
        this.message1 = message1;
        return this;
    }

    public String getMessage3() {
        System.out.println(message3);
        return message3;
    }

    public HelloUK setMessage3(String message3) {
        this.message3 = message3;
        return this;
    }

    public String getMessage2() {
        System.out.println(message2);
        return message2;
    }

    public HelloUK setMessage2(String message2) {
        this.message2 = message2;
        return this;
    }
}
