package com.demo.spring.api.rest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 16:15 2019/8/8.
 */
@ConfigurationProperties(prefix = "host")
@Component
@Setter
@Getter
public class MyConfig {
    private String name;

}