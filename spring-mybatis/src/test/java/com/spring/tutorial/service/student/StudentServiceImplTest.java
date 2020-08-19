package com.spring.tutorial.service.student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/conf/spring-mybatis.xml"})
public class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void createStudent() {
        studentService.createStudent();
    }
}