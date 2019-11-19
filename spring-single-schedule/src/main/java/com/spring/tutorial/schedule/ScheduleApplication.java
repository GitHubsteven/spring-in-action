package com.spring.tutorial.schedule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:59 2019/11/19.
 */
public class ScheduleApplication {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("/conf/Beans.xml");
    }
}