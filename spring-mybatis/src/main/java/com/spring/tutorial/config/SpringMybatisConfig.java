package com.spring.tutorial.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description: spring mybatis config
 * @Date: Created at 9:42 2018/4/17.
 */
@Configuration
@ComponentScan(value = "com.spring.tutorial")
@MapperScan(value = "com.spring.tutorial")
public class SpringMybatisConfig {
    @Bean
    DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/study?useSSL=false");
        dataSource.setUrl("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
    @Bean
    JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    @Bean
    SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean;
    }
}
