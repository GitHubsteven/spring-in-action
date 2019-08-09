package com.demo.spring.api.rest;

import com.demo.spring.api.rest.config.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:17 2019/8/8.
 */
@SpringBootApplication
@ImportResource("classpath:com.demo.spring.api.rest.service.*")
@EnableAsync
public class SpringApiRestApplication {
    public static void main(String[] args) {
        new StartCommand(args);
        SpringApplication.run(SpringApiRestApplication.class, args);
    }
}