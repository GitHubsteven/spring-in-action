package com.demo.rest.api.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import spring.in.action.spring.api.service.ITestService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 13:45 2019/8/26.
 */
@FeignClient(name = "${api.provider.name}")
public interface TestClient extends ITestService {
}