package com.demo.ribbon.balancer.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 18:56 2019/8/20.
 */
//@Configuration
public class MyConfiguration {
//    @LoadBalanced
//    @Bean
    RestTemplate loadBalanced() {
        return new RestTemplate();
    }

//    @Primary
//    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}