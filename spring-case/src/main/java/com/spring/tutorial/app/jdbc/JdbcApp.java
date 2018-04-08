package com.spring.tutorial.app.jdbc;

import com.spring.tutorial.configure.SpringConfiguration;
import com.spring.tutorial.jdbc.StudentJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 12:33 2018/4/8.
 */
public class JdbcApp {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/conf/jdbc.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("chris", 11);
//        studentJDBCTemplate.create("Nuha", 2);
//        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
    }
}
