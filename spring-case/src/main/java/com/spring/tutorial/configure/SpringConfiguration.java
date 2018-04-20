package com.spring.tutorial.configure;


import com.spring.tutorial.jdbc.StudentJDBCTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 10:12 2018/4/4.
 */

/**
 * This annotation is used on classes which define beans.
 * @Configuration is an analog for XML configuration file – it is configuration using Java class.
 * Java class annotated with @Configuration is a configuration by itself and will have methods to instantiate and configure the dependencies.
 *
 * @Lazy
 * This annotation is used on component classes. By default all autowired dependencies are created and configured at startup.
 * But if you want to initialize a bean lazily, you can use @Lazy annotation over the class.
 * This means that the bean will be created and initialized only when it is first requested for.
 * You can also use this annotation on @Configuration classes. This indicates that all @Bean methods within that @Configuration should be lazily initialized.
 */

@Lazy
@Configuration
@ComponentScan("com.spring.tutorial")
public class SpringConfiguration {
    @Bean
    @Lazy
    DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/study?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    @Lazy
    StudentJDBCTemplate studentJDBCTemplate(){
        StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
        studentJDBCTemplate.setDataSource(dataSource());
        return studentJDBCTemplate;
    }
}
