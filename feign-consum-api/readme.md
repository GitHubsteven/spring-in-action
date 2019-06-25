##### 关于日志 #####
如何部署一个日志，请参考如下[A Guide To Logback](https://www.baeldung.com/logback)

##### 什么是feign #####
声明式的httpClient
>In this tutorial, we will introduce and explain Feign, a declarative HTTP client developed by Netflix.
Feign aims at simplifying HTTP API clients. 
Simply put, the developer needs only to declare and annotate an interface while the actual implementation will be provisioned at runtime.

##### 关于feign的使用说明 #####
通常我们使用URLConnection/org.apache.http.client.fluent.Executor来进行网络通信，但是feign的出现，给我们
提供了另外的一种http协议通信选择，更简单简洁

请参考[Intro to Feign](https://www.baeldung.com/intro-to-feign)

##### 异常 ######
1. Feign使用okhttpclient时报错:original request is required
解决方案：参考[Feign使用okhttpclient时报错:original request is required](https://blog.csdn.net/u013887008/article/details/89785494)
如果连接失效，那么就是发现原来是 feign-core 的版本和 feign-okhttp版本不一致问题引起的。

##### 关于原理的分析 #####
基于接口开发，很有意思的想法，在现在常见的框架中，我们常见的都是基于template/factory + interface的模式来定义和获取行为的
然后框架会提供一个（这里的一个不仅仅是一个，仅仅表示一个概念）默认的行为实现来。feign提供了默认的网络通信的工具包等等，个人
感觉在我们的日常框架开发中也是值得非常借鉴的。
1. 明白和定义自己的行为
2. 注入的方式注入需求的接口

在解析结果的过程，这里放回的不再是一个注入下面的对象
```
public class Response<T> {
    private String code;
    private String message;
    private String status;
    private T data;
}
```
然后解析返回的数据（通常来说，我们对外的api都是对外一个类似的数据格式，我不知道这是不是一种标准，但是大多数都是这样的），
自定义判断，但是feign不是，feign给人一种感觉，就像在jvm中开发，server-side对外的是什么数据格式，无论是list/map还是其他的什么
自定义数据，我们在client中都是定义相同的数据，甚至包括void，这很好，很直观，尤其是在非对外开发的时候。

作为支持spring cloud的微服务落地实践，这很好，但是对于api对外来说，也许也不是那么好，我们通常必须区别内容的微服务和
对外的api的区别，对内的微服务通常是自己使用，但是对外来说，api服务于千万中框架，符合统一的标准是必须的。这在我们实际
开发过程中是遇到了这个问题。