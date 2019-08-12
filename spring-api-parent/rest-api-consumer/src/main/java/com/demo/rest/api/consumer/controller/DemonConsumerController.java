package com.demo.rest.api.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.in.action.spring.api.service.IDemoService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 17:24 2019/8/12.
 */
@RestController
public class DemonConsumerController {
    @Autowired
    private IDemoService iDemoService;

    @GetMapping("/consume-hi")
    public String concat(@RequestParam("name") String name) {
//        return "name";
        String prefix = iDemoService.hello();
        return prefix + name;
    }
}