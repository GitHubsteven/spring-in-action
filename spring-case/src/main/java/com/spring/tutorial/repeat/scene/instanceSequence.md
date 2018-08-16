```text
    bean instance sequence
    1：static field
    2：static code block
    3: common field
    4: common code block
    5: constructor
```
It is to understand it. Commonly speacking, the fields are instanted before the methods because the fields usually are used in
the methods. At the the same time, the static must be instanted early than the common members.
```$xslt
 父类和子类的初始化顺序；		
 		
 1：父类static字段		
 2: 父类static代码块		
 3：子类static字段		
 4：子类static代码块		
 5：父类普通代码块		
 6：父类构造函数		
 7：子类普通代码块		
 8：子类构造函数		
详情参考:com.spring.tutorial.repeat.scene.instant.Test.class
```

@Autowired spring offical document:

```text
@Target(value={CONSTRUCTOR,METHOD,PARAMETER,FIELD,ANNOTATION_TYPE})
 @Retention(value=RUNTIME)
 @Documented
public @interface Autowired
Marks a constructor, field, setter method or config method as to be autowired by Spring's dependency injection facilities.
Only one constructor (at max) of any given bean class may carry this annotation, indicating the constructor to autowire when used as a Spring bean. Such a constructor does not have to be public.

Fields are injected right after construction of a bean, before any config methods are invoked. Such a config field does not have to be public.

Config methods may have an arbitrary name and any number of arguments; each of those arguments will be autowired with a matching bean in the Spring container. Bean property setter methods are effectively just a special case of such a general config method. Such config methods do not have to be public.

In the case of a multi-arg constructor or method, the 'required' parameter is applicable to all arguments. Individual parameters may be declared as Java-8-style Optional or, as of Spring Framework 5.0, also as @Nullable or a not-null parameter type in Kotlin, overriding the base required semantics.

In case of a Collection or Map dependency type, the container autowires all beans matching the declared value type. For such purposes, the map keys must be declared as type String which will be resolved to the corresponding bean names. Such a container-provided collection will be ordered, taking into account Ordered/Order values of the target components, otherwise following their registration order in the container. Alternatively, a single matching target bean may also be a generally typed Collection or Map itself, getting injected as such.

Note that actual injection is performed through a BeanPostProcessor which in turn means that you cannot use @Autowired to inject references into BeanPostProcessor or BeanFactoryPostProcessor types. Please consult the javadoc for the AutowiredAnnotationBeanPostProcessor class (which, by default, checks for the presence of this annotation).
```

Part1: It's easy to know that:
```text
1: the @Autowired decorate the bean taking constructor as the primary priority.
2: the common fields
3: configuration mtehod 
```
Part2: Take the sequence of the java bean instant: 
```text
1: parent static field
2: parent static code block
3: sub static field
4: subclass static doe bolck
5: parent common code block
6: parent constructor
7: sub common code block
8: sub constructor

```
combine the part1 and part2, it is easy to know @Autowired decorate the the bean start at the constructor while the constructor is the end of the part1.
To prove it, we write the following code: 
```java
package com.spring.tutorial.repeat.scene.spring.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 19:02
 * @Description:
 * @version: 1.0.0
 */
@Component
public class SuperClass {
    private static String staticField = getStaticField();
    private String commonField = this.setCommonField();


    static {
        System.out.println("---parent: static code block");
    }

    {
        System.out.println("---parent: common code block");
    }

    SuperClass() {
        System.out.println("---parent: constructor");
    }

    @PostConstruct
    public void postCon() {
        System.out.println("---parent: postConstructor");
    }

    @Autowired
    public void configMethod() {
        System.out.println("---parent: autowired config method!");
    }

    private static String getStaticField() {
        System.out.println("---parent: init static field");
        return "---staticField";
    }

    public void commonMethod() {
        System.out.println("---parent: common method");
    }

    public String setCommonField() {
        System.out.println("---parent: common field");
        return "";
    }
}
```

result is :
```text
---parent: init static field
---parent: static code block
---parent: common field
---parent: common code block
---parent: constructor

---parent: autowired config method!
---parent: postConstructor

```
all is in our expectation.
Sequence of bean instance: bean individual instance > spring decorate(you can rename it as spring instance) > postConstructor.

So what about the Spring in extends?
```java
package com.spring.tutorial.repeat.scene.spring.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SubClass extends SuperClass {
    private static String subStaticField = getSubStaticField();
    private String subCommonField = this.setSubCommonField();


    static {
        System.out.println("***sub: static code block");
    }

    {
        System.out.println("***sub: common code block");
    }

    SubClass() {
        super("***sub");
        System.out.println("***sub: constructor");
    }

    @PostConstruct
    public void postSubCon() {
        System.out.println("***sub: postConstructor");
    }

    @Autowired
    public void subConfigMethod() {
        System.out.println("***sub: autowired config method!");
    }

    private static String getSubStaticField() {
        System.out.println("***sub: init static field");
        return "staticField";
    }

    public void subCommonMethod() {
        System.out.println("***sub: common method");
    }

    public String setSubCommonField() {
        System.out.println("***sub: common field");
        return "";
    }
}

```

```text
---parent: init static field
---parent: static code block
***sub: init static field
***sub: static code block
---parent: common field
---parent: common code block
---parent: constructor ***sub
***sub: common field
***sub: common code block
***sub: constructor
2018-07-09 20:24:11 WARN  o.s.b.f.a.AutowiredAnnotationBeanPostProcessor - Autowired annotation should only be used on methods with parameters: public void com.spring.tutorial.repeat.scene.spring.lifecycle.SubClass.subConfigMethod()
2018-07-09 20:24:11 WARN  o.s.b.f.a.AutowiredAnnotationBeanPostProcessor - Autowired annotation should only be used on methods with parameters: public void com.spring.tutorial.repeat.scene.spring.lifecycle.SuperClass.configMethod()
---parent: autowired config method!
***sub: autowired config method!
---parent: postConstructor
***sub: postConstructor
---parent: common field
---parent: common code block
---parent: constructor
2018-07-09 20:24:11 WARN  o.s.b.f.a.AutowiredAnnotationBeanPostProcessor - Autowired annotation should only be used on methods with parameters: public void com.spring.tutorial.repeat.scene.spring.lifecycle.SuperClass.configMethod()
---parent: autowired config method!
---parent: postConstructor
life2
life1
***sub: common method

```
from the result: we can get it: parent @Autowired config method > sub @Autowired config method > parent @postConstruct > sub @PostConstruct.