package com.spring.tutorial.aop.declare;

import org.aspectj.lang.annotation.*;

import java.util.Date;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 21:37 2018/4/12.
 */
@Aspect
public class Logging {

    @Pointcut("execution(* com.spring.tutorial.aop.AopService.*(..))")
    public void businessService() {
    }

    @Before("businessService()")
    public void beforeAdvisor() {
        System.out.println("before task start :" + new Date().toString());
    }

    @After("businessService()")
    public void afterAdvisor() {
        System.out.println("after task start :" + new Date().toString());
    }
//
//    @Around("businessService()")
//    public Object aroundAdvisor(ProceedingJoinPoint pjp) {
//        System.out.println("around task start :" + new Date().toString());
//        System.out.println(pjp.toString());
//        return pjp.toString();
//    }

    @AfterReturning(value = "businessService()", returning = "rstVal")
    public void afterReturnAdvisor(Object rstVal) {
        System.out.println("return result val is: " + rstVal);
    }

    @AfterThrowing(value = "businessService()", throwing = "ex")
    public void afterExceptionAdvisor(Exception ex) {
        System.out.println("Exception occurs:" + ex.getMessage());
    }
}
