package com.spring.tutorial.aop.declare;

import org.aspectj.lang.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 21:37 2018/4/12.
 */
@Aspect
public class Logging {

    //Here the first wildcard matches any return value, the second matches any method name,
    // and the (..) pattern matches any number of parameters (zero or more).

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
        List<Object> real = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            real.add(rstVal);
        }
        rstVal = real;
        System.out.println("return result val is: " + rstVal);
    }

    @AfterReturning(value = "businessService()",returning = "rstVal")
    public void afterReturnAdvisor1(Object rstVal) {
        List<Object> real = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            real.add(rstVal);
        }
        rstVal = real;
        System.out.println("return result val is: " + rstVal);
    }


    @AfterThrowing(value = "businessService()", throwing = "ex")
    public void afterExceptionAdvisor(Exception ex) {
        ex = new NullPointerException();
        System.out.println("Exception occurs:" + ex.getMessage());
    }
}
