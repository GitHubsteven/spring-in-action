#### todos
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
虽然网上说yml文件也可以，但是试了不可以，那就暂时试试.properties吧
   