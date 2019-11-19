package com.demo.spring.api.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.in.action.spring.api.service.ITestService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 13:52 2019/8/26.
 */
@RestController
public class TestController implements ITestService {
    @Override
    public String introduce() {
        return "hi, this is test intr";
    }
}