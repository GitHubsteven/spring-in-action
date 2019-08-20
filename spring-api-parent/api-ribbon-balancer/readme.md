##### 如何实现Ribbon + RestTemplate
1. 通过maven引入jar包
```
  <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
            <version>1.4.0.RELEASE</version>
        </dependency>
```
版本可变

2. 注入RestTemplate，可以在application，也可以在Controller，Service等@component类中
```
 @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

```
3. application 增加声明RobbinClient(xxx)，代码如下
```
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
}
```
4. 在application.yml中配置
```
spring:
  application:
    name: ribbon-consumer
server:
  port: 8888

ribbon-consumer:
  ribbon:
    eureka:
      enabled: false
    listOfServers: localhost:8090,localhost:8091
    ServerListRefreshInterval: 15000
```