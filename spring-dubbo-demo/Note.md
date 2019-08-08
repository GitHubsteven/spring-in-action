Reference Doc：[Apache dubbo](https://dubbo.apache.org/en-us/docs/user/quick-start.html)

##### XMLNS Error
Apache Dubbo official document occurs error, are you kidding me?
```
 Configuration problem: Unable to locate Spring NamespaceHandler for XML schema namespace [http://dubbo.apache.org/schema/dubbo]
```
Reference Document: [Unable to locate Spring NamespaceHandler for XMLschemanamespace http://dubbo.apache.org/schema/dubbo](https://blog.csdn.net/niugang0920/article/details/81944865) 

Seeing the spring.handlers
```
http\://code.alibabatech.com/schema/dubbo=com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler
```
the official document provider.xml code like the followings
```
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:dubbo="http://dubbo.apache.org/schema/dubbo"
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
       http://dubbo.apache.org/schema/dubbo http://dubbo.apache.org/schema/dubbo/dubbo.xsd">
```
Absolutely, spring can not understand the right dubbo namespace. Change the xmlns to the following code.
```
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.3.xsd
         http://code.alibabatech.com/schema/dubbo
     http://code.alibabatech.com/schema/dubbo/dubbo.xsd">
```

This is the case from the apache official document, if you download the dubbo git project
Dubbo-Demo, if you still reference the above xml namespace and schema setting, you will find
your project has errors for the xml schema is different again. Just change the xml config
to be the same with the git provided example.

##### Zookeeper Version Conflict

