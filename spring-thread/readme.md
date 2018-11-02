**场景分析：**

对于成员变量来说，多线程仍然是个问题，同时，在spring中，这个问题，可能会更加严重，已知条件：
1. spring bean 容器中是单一模式
    ```
    Q1: 那么是否可以说，在单线程中，所有的service的类是相同的？
    ```
2. 推测：在多线程中，spring中引进的service可以保持不同，对于不同的线程来说，这是理所当然的。
    ```
    证明它
    ```
3. ThreadLocal真的可以保证多线程下，成员变量的独一性吗？
  
    场景设计：一个service， service中有两个成员变量Member{name:string}, ThreadLocal<Member>，
    在请求端发送参数name,后端返回上下文+“name:name”,在service的set和get之间增加Thread.sleep,增加线程的处理时间
    详情请参考HelloController + HelloService.
    测试case: 一次性发送多个请求，看返回的结果name是否和发送的一致。




4. 如果threadLocal 无法保证的话，那么该用干什么方式来保证。


场景设计：