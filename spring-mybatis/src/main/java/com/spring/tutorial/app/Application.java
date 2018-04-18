package com.spring.tutorial.app;

import com.spring.tutorial.service.student.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:45 2018/4/18.
 */
public class Application {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringMybatisConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        StudentServiceImpl service = context.getBean(StudentServiceImpl.class);
        service.createStudent();
    }
}
