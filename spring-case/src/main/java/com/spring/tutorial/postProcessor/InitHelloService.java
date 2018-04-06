package com.spring.tutorial.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * how can i know which post process will be called to init the corresponding object, should i set some configuration to
 * make sure the processor?
 * <p>
 * An ApplicationContext automatically detects any beans that are defined with the implementation of the BeanPostProcessor
 * interface and registers these beans as postprocessors,to be then called appropriately by the container upon bean creation.
 */
public class InitHelloService implements BeanPostProcessor {
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("before initialization: "+ beanName);
        return bean;
    }


    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("after initialization: "+ beanName);
        return bean;
    }
}
