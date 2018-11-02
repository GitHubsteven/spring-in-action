package com.spring.tutorial.aop.declare;

import com.spring.tutorial.aop.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 22:05 2018/4/12.
 */
public class AopDecApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/aop-dec.xml");
        AopService service = (AopService) context.getBean("aopService");
        Integer result = service.operate2(2);
        System.out.println(result);
    }
}
