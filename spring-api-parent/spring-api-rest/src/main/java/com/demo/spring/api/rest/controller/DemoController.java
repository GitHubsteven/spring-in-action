package com.demo.spring.api.rest.controller;

import com.demo.spring.api.rest.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.in.action.spring.api.service.IDemoService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:18 2019/8/8.
 */
@RestController
public class DemoController implements IDemoService {

    //    读取配置方式一
    @Value("${server.port}")
    private String port;

    //    读取配置方式二
    private final Environment evn;

    //    读取配置方式三
    private final MyConfig config;

    @Autowired
    public DemoController(Environment evn, MyConfig config) {
        this.evn = evn;
        this.config = config;
    }

    @Override
    public String hello(@RequestParam String name) {
        return String.format("hello,%s, this is %s(:%s) created at %s!", name, config.getName(), port, evn.getProperty("server.create-time"));
    }

    @Override
    public String info() {
        return String.format("hello, this is %s(:%s) created at %s!", config.getName(), port, evn.getProperty("server.create-time"));
    }
}