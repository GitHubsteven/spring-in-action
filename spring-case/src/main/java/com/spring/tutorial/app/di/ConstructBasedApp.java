package com.spring.tutorial.app.di;

import com.spring.tutorial.di.constructor_based.MoreParamDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructBasedApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/Beans.xml");

//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();

        MoreParamDI moreParamDI = context.getBean(MoreParamDI.class);
        moreParamDI.introduce();
    }
}
