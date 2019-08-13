package com.demo.rest.api.consumer.client;

import com.demo.rest.api.consumer.config.FeignClientConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import spring.in.action.spring.api.service.IDemoService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 16:49 2019/8/12.
 */
@FeignClient(name = "${api.provider.name}", url = "http://localhost:8090", configuration = FeignClientConfiguration.class)
public interface DemoClient extends IDemoService {
}