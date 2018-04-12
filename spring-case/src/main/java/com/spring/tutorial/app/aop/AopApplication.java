package com.spring.tutorial.app.aop;

import com.spring.tutorial.aop.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 20:07 2018/4/12.
 */
public class AopApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/aop.xml");
        AopService service = (AopService)context.getBean("aopService");
        service.operate3();
//        运行前时间：1523538349379
//        operate 3 running ...
//        运行后时间：1523538349398
    }
}
