# Dubbo-Demo
Dubbo-Demo

dubbo-api是公共的接口部分
dubbo-consumer 消费者
dubbo-provider 服务提供者

首先启动 dubbo-provider的ProviderTest类，此时dubbo会将服务信息注册到zookeeper中，

可以在zookeeper中查看：

/zkCli.sh -server 127.0.0.1:2181
ls /dubbo/com.test.DemoService/providers

