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

4. 如果threadLocal 无法保证的话，那么该用干什么方式来保证。


场景设计：