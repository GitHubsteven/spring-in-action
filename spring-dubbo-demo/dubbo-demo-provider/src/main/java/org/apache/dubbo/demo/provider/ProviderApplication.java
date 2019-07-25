package org.apache.dubbo.demo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.provider.service.DemoServiceImpl;
import org.apache.dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 11:03 2019/7/25.
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        provideByBean();
    }

    private static void provideByBean() throws IOException {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-provider");
        application.setVersion("1.0");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("multicast://224.1.1.1:9090");
        //register a bean
        ServiceConfig<DemoService> service = new ServiceConfig<>();
        service.setApplication(application);
        service.setRegistry(registryConfig);
        service.setInterface(DemoService.class);
        service.setRef(new DemoServiceImpl());

        service.export();
        System.in.read();
    }

    private static void provideByBean2() throws IOException {
        ServiceConfig<DemoServiceImpl> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("dubbo-demo-api-provider"));
        service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        service.setInterface(DemoService.class);
        service.setRef(new DemoServiceImpl());
        service.export();
        System.in.read();
    }
}