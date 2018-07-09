package com.spring.tutorial.repeat.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 14:39
 * @Description:
 * @version: 1.0.0
 */
@Lazy
@Configuration
@ComponentScan(value = "com.spring.tutorial")
public class DiConfiguration {
}