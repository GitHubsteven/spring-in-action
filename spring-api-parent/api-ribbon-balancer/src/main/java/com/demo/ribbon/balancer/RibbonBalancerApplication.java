package com.demo.ribbon.balancer;

import com.demo.ribbon.balancer.configuration.RibbonConfiguration;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.ByteSource;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author jet.xie
 * @Description:
 * @Date: Created at 11:10 2019/8/20.
 */
@SpringBootApplication
@RibbonClient(name = "api-service", configuration = RibbonConfiguration.class)
public class RibbonBalancerApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonBalancerApplication.class, args);
    }

    private static void singleRibbon() {
        List<Server> serverList = Lists.newArrayList(new Server("localhost", 8090),
                new Server("localhost", 8091));
//        final DefaultClientConfigImpl clientConfig = new DefaultClientConfigImpl();
//        clientConfig.setClientName("spring-api-ribbon");
//        clientConfig.set(CommonClientConfigKey.ServerListRefreshInterval, 300 * 1000);
        //build ILoadBalancer
        ILoadBalancer loadBalancer = LoadBalancerBuilder.newBuilder().buildFixedServerListLoadBalancer(serverList);
        //call api five times to see the effect.
        for (int i = 0; i < 5; i++) {
            String result = LoadBalancerCommand.<String>builder()
                    .withLoadBalancer(loadBalancer)
                    .build()
                    .submit(new ServerOperation<String>() {
                        @Override
                        public Observable<String> call(Server server) {
                            try {
                                String addr = "http://" + server.getHost() + ":" + server.getPort() +
                                        "/demo/info";
                                System.out.println("调用地址：" + addr);
                                URL url = new URL(addr);
                                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                                conn.setRequestMethod("GET");
                                conn.connect();
                                InputStream in = conn.getInputStream();
                                ByteSource byteSource = new ByteSource() {
                                    @Override
                                    public InputStream openStream() throws IOException {
                                        return in;
                                    }
                                };
                                return Observable.just(byteSource.asCharSource(Charsets.UTF_8).read());
                            } catch (IOException e) {
                                return Observable.error(e);
                            }
                        }
                    })
                    .toBlocking()
                    .first();
            System.out.println("调用result：" + result);
        }
    }
}