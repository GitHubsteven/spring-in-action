package com.demo.rest.api.consumer.controller;

import com.demo.rest.api.consumer.client.DemoClient;
import com.demo.rest.api.consumer.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.in.action.spring.api.service.IDemoService;
import spring.in.action.spring.api.service.ITestService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 17:24 2019/8/12.
 */
@RestController
public class DemonConsumerController {
    @Autowired
    private DemoClient iDemoService;
    @Autowired
    private TestClient iTestService;

    @GetMapping("/consume-hi")
    public String concat(@RequestParam("name") String name) {
//        return "name";
        String prefix = iDemoService.hello(null);
        return prefix + name;
    }

    @GetMapping("consumer/test/introduce")
    public String consumeTestIntr() {
        return "consume " + iTestService.introduce();
    }
}