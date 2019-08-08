##### 环境
| 角色  | 作用
|---|---|
| spring  | java bean 管理
| dubbo  | 接口网络通信实现，服务定义和实现
| zookeeper  | dubbo服务的注册和管理
 
#### zookeeper
##### 是什么？
>ZooKeeper is a centralized service for maintaining configuration information, naming, providing distributed synchronization, and providing group services

一个集中化注册和管理分布式服务的系统。服务提供者在这里注册服务，服务消费者在这里获取服务提供者
信息，然后消费服务。
##### 安装
1. 安装好像挺简单的，安装好了，如果只是开发测试，就什么配置不需要改了，否则的话建议重新在conf文件夹中的zoo-sample.cf配置
data和log的目录文件，具体的参考百度
2. 启动bin/zkServer.cmd(windows)，就可以了，这样就有服务注册和管理中心。