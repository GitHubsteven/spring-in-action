package com.spring.tutorial.lifeCycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:59 2018/4/5.
 */
@Lazy
@Component
public class InitExampleBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " will be initialized");
    }

    public void introduce() {
        System.out.println("hi, i am " + this.getClass().getSimpleName());
    }
}
