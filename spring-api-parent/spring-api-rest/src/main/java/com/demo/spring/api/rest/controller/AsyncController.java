package com.demo.spring.api.rest.controller;

import com.demo.spring.api.rest.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:21 2019/8/9.
 */
@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/log")
    public String log() {
        asyncService.saveLog();
        return "ok";
    }

}