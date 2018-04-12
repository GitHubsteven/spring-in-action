package com.spring.tutorial.aop;

import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 19:14 2018/4/12.
 */
@Aspect
public class TimeLogAspect {
    public void after() {
        System.out.println("运行后时间：" + new Date().getTime());
    }

    public void before() {
        System.out.println("运行前时间：" + new Date().getTime());
    }

    public void afterThrow() {
        System.out.println("运行抛出异常时间：" + new Date().getTime());
    }

    public void afterReturn(Object retVal) {
        System.out.println("运行返回后时间：" + new Date().getTime());
        System.out.println("运行返回结果：" + retVal.toString());
    }

    public void around() {
        System.out.println("运行时间：" + new Date().getTime());
    }
}
