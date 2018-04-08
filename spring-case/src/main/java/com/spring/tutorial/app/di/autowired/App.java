package com.spring.tutorial.app.di.autowired;

import com.spring.tutorial.di.constructor_based.TextEditorNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/autowired.xml");
        TextEditorNew te = (TextEditorNew) context.getBean("textEditorNew");
        te.spellCheck();
    }
}
