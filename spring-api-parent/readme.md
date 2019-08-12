#### Reference Book
1. 重新定义spring cloud实战-许进
2. spring cloud微服务全栈与案例解析

#### TODOS
1. 为什么打包的时候执行如下代码不能动态改环境
    ```
    java -jar xxx.jar --spring.profiles.active=test
    ```
    没法设置环境，文件结构如下
    ```
    application.yml
    application-dev.yml
    application-prod.yml
    application-test.yml
    ```
虽然网上说yml文件也可以，但是试了不可以，那就暂时试试.properties吧。原来最后原因是因为
我启动代码如下：
```
SpringApplication.run(SpringApiRestApplication.class);
```
忘记了把参数传进去，应该改成代码如下
```
SpringApplication.run(SpringApiRestApplication.class,args);
```   
#### NOTES
1. SpringApplication重启两次的问题

在用了spring cloud的devTools出现这个问题，原因参考 [DevTools新开线程重载Application](https://www.oschina.net/question/1050447_2151212?sort=time)
方法处理，删除devTools依赖。
