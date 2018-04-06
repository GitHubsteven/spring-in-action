package com.spring.tutorial.app;

import com.spring.tutorial.configure.SpringConfiguration;
import com.spring.tutorial.lifeCycle.InitExampleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:42 2018/4/5.
 */
public class LifeCycleMainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        InitExampleBean iniBean = context.getBean(InitExampleBean.class);
        iniBean.introduce();
    }
}
