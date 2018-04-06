Constructor arguments resolution
There may be an ambiguity while passing arguments to the constructor, in case there are more than one parameters. To resolve this ambiguity, the order in which the constructor arguments are defined in a bean definition is the order in which those arguments are supplied to the appropriate constructor. Consider the following class −

```
package x.y;

public class Foo {
   public Foo(Bar bar, Baz baz) {
      // ...
   }
}
```

The following configuration works fine −

```
<beans>
   <bean id = "foo" class = "x.y.Foo">
      <constructor-arg ref = "bar"/>
      <constructor-arg ref = "baz"/>
   </bean>

   <bean id = "bar" class = "x.y.Bar"/>
   <bean id = "baz" class = "x.y.Baz"/>
</beans>
```
Let us check one more case where we pass different types to the constructor. Consider the following class −
```
package x.y;

public class Foo {
   public Foo(int year, String name) {
      // ...
   }
}
```
The container can also use type matching with simple types, if you explicitly specify the type of the constructor argument using the type attribute. For example −
```
<beans>

   <bean id = "exampleBean" class = "examples.ExampleBean">
      <constructor-arg type = "int" value = "2001"/>
      <constructor-arg type = "java.lang.String" value = "Zara"/>
   </bean>

</beans>
```
Finally, the best way to pass constructor arguments, use the index attribute to specify explicitly the index of constructor arguments. Here, the index is 0 based. For example −

```
<beans>

   <bean id = "exampleBean" class = "examples.ExampleBean">
      <constructor-arg index = "0" value = "2001"/>
      <constructor-arg index = "1" value = "Zara"/>
   </bean>

</beans>
```
A final note, in case you are passing a reference to an object, you need to use ref attribute of <constructor-arg> tag and if you are passing a value directly then you should use value attribute as shown above.