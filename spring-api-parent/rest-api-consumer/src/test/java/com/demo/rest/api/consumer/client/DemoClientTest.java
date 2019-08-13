package com.demo.rest.api.consumer.client;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.in.action.spring.api.service.IDemoService;

import static org.junit.Assert.*;

public class DemoClientTest extends ConsumerBaseTest {
    @Autowired
    private IDemoService iDemoService;

    @Test
    public void hello() {
        System.out.println(iDemoService.hello(null));
    }
}