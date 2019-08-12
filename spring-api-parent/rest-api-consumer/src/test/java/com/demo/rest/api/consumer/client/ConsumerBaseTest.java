package com.demo.rest.api.consumer.client;

import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 17:14 2019/8/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class ConsumerBaseTest {

    @SpringBootApplication
    @EnableFeignClients("com.demo.rest.api.consumer.client")
    public static class ConsumerConfiguration {}

}