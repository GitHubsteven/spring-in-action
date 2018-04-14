package com.spring.tutorial.app;

import com.spring.tutorial.di.constructor_based.TextEditor;
import com.spring.tutorial.di.constructor_based.TextEditorNew;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 14:39 2018/4/14.
 */
public class AutowireApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/autowired.xml");
        TextEditorNew textEditorByType =(TextEditorNew) context.getBean("textEditorByType");
        textEditorByType.spellCheck();

        System.out.println("===============================");
        TextEditor textEditorByCon =(TextEditor) context.getBean("textEditorByCon");
        textEditorByCon.spellCheck();
    }
}
