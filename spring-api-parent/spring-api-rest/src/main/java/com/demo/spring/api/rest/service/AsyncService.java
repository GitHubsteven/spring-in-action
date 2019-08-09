package com.demo.spring.api.rest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 15:24 2019/8/9.
 */
@Service
public class AsyncService {
    @Async
    public void saveLog() {
        System.err.println(Thread.currentThread().getName());
    }
}