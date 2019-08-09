package com.demo.spring.api.rest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description: ConfigurationProperties注释的配置，如果在配置文件中配置信息的话，那么
 * 就会返回默认值
 * @Date: Created at 15:28 2019/8/9.
 */
@Configuration
@ConfigurationProperties(prefix = "spring.task.pool")
@Setter
@Getter
public class TaskThreadPoolConfig {
    //核心线程数
    private int corePoolSize = 5;
    //最大线程数
    private int maxPoolSize = 50;
    //线程维护线程池允许的空闲时间
    private int keepAliveSeconds = 60;
    //队列长度
    private int queueCapacity = 10000;
    //线程名称前缀
    private String threadNamePrefix = "FSH-AsyncTask-";
}