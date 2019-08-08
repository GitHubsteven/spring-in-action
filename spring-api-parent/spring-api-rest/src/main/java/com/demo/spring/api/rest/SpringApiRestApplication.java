package com.demo.spring.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:17 2019/8/8.
 */
@SpringBootApplication
@ImportResource("classpath:com.demo.spring.api.rest.service.*")
public class SpringApiRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApiRestApplication.class);
    }
}