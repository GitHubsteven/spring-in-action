##### Realize Ribbon + RestTemplate
1. import jar by maven
```
  <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
            <version>1.4.0.RELEASE</version>
        </dependency>
```
change the version to the corresponding your project

2. inject RestTemplate in application，Controller，Service and some annotated by @component or @configuration
```
 @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

```
3. Add annotation RobbinClient(xxx) on application ，code like the following
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
4. application.yml
```
#define the rest api name
spring:
  application:
    name: ribbon-consumer
server:
  port: 8888

#define the rest api name detail used to called by restTemplate
ribbon-consumer:
  ribbon:
    eureka:
      enabled: false
    listOfServers: localhost:8090,localhost:8091
    ServerListRefreshInterval: 15000
```
Note: you have to define the rules of the spring-application-name for the usage of the restTemplate

5. call the http request by the restTemplate
```
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        //api-service
        String info = restTemplate.getForObject("http://ribbon-consumer/demo/info", String.class);
        return "hi, this is ribbon! " + info;
    }
}
```

Note: the service name is this spring application name here.
