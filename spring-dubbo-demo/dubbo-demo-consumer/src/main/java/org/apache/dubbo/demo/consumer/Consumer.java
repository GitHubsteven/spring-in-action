package org.apache.dubbo.demo.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.apache.dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 14:32 2019/7/23.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        consumByBean();
    }

    private static void consumByBean() {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-consumer");
        application.setVersion("1.0");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("multicast://224.1.1.1:9090");

        ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
        reference.setApplication(application);
        reference.setRegistry(registryConfig);
        reference.setInterface(DemoService.class);

        DemoService greetingsService = reference.get();
        String hiMessage = greetingsService.sayHello("baeldung");
        System.out.println(hiMessage);
    }

    private static void consumByBean2() {
        ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("dubbo-demo-api-consumer"));
        reference.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        reference.setInterface(DemoService.class);
        DemoService service = reference.get();
        String message = service.sayHello("dubbo");
        System.out.println(message);
    }

    private static void xmlConsumer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService) context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);
    }
}