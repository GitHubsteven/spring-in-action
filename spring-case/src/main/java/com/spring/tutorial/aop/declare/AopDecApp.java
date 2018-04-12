package com.spring.tutorial.aop.declare;

import com.spring.tutorial.aop.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 22:05 2018/4/12.
 */
public class AopDecApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/aop-dec.xml");
        AopService service = context.getBean(AopService.class);
        service.operate2();

        /**
         * 为什么吃不掉异常呢？仍然会往上一级传播。
         *
         *
         * before task start :Thu Apr 12 22:15:21 CST 2018
         operate 2 running ...
         after task start :Thu Apr 12 22:15:21 CST 2018
         Exception occurs:test exception!
         Exception in thread "main" java.lang.RuntimeException: test exception!
         at com.spring.tutorial.aop.AopService.operate2(AopService.java:17)
         at com.spring.tutorial.aop.AopService$$FastClassBySpringCGLIB$$633caf9b.invoke(<generated>)
         at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:204)
         at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:747)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
         at org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor.invoke(MethodBeforeAdviceInterceptor.java:52)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:185)
         at org.springframework.aop.aspectj.AspectJAfterAdvice.invoke(AspectJAfterAdvice.java:47)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:185)
         at org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor.invoke(AfterReturningAdviceInterceptor.java:52)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:185)
         at org.springframework.aop.aspectj.AspectJAfterThrowingAdvice.invoke(AspectJAfterThrowingAdvice.java:62)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:185)
         at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:92)
         at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:185)
         at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)
         at com.spring.tutorial.aop.AopService$$EnhancerBySpringCGLIB$$1aaae675.operate2(<generated>)
         at com.spring.tutorial.aop.declare.AopDecApp.main(AopDecApp.java:17)
         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         at java.lang.reflect.Method.invoke(Method.java:498)
         at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

         */
    }
}
