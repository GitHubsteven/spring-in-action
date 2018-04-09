Programmatic transaction management approach allows you to manage the transaction with the help of programming in your source code. 
That gives you extreme flexibility, but it is difficult to maintain.

Before we begin, it is important to have at least two database tables on which we can perform various CRUD operations with the help of transactions. Let us consider a Student table, which can be created in MySQL TEST database with the following DDL −
```
CREATE TABLE Student(
   ID   INT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(20) NOT NULL,
   AGE  INT NOT NULL,
   PRIMARY KEY (ID)
);
```

Second table is Marks in which we will maintain marks for students based on years. Here SID is the foreign key for Student table.
```
CREATE TABLE Marks(
   SID INT NOT NULL,
   MARKS  INT NOT NULL,
   YEAR   INT NOT NULL
);
```
Let us use ***PlatformTransactionManager*** directly to implement the programmatic approach to implement transactions. To start a new transaction, you need to have a instance of ***TransactionDefinition*** with the appropriate transaction attributes.
 For this example, we will simply create an instance of ***DefaultTransactionDefinition*** to use the default transaction attributes.
 Let us use ***PlatformTransactionManager** directly to implement the programmatic approach to implement transactions. To start a new transaction, you need to have a instance of ***TransactionDefinition*** with the appropriate transaction attributes. For this example, we will simply create an instance of ***DefaultTransactionDefinition*** to use the default transaction attributes.
 Once the TransactionDefinition is created, you can start your transaction by calling getTransaction() method, which returns an instance of TransactionStatus. The TransactionStatus objects helps in tracking the current status of the transaction and finally, if everything goes fine, you can use commit() method of PlatformTransactionManager to commit the transaction, otherwise you can use rollback() to rollback the complete operation.
 
 