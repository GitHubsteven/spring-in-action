package com.spring.tutorial.service.activity;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;

import javax.annotation.PreDestroy;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:30 2018/4/5.
 */
@Component
public class StudyService {

    private final HelloService helloService;
    private final SportService sportService;

    /*version after 4.3.0 class you can inject beans without annotation
    NOTE: As of Spring 4.3, @Autowired  became optional on classes with a single constructor.
    In the above example, Spring would still inject an instance of the Person  class if you omitted the @Autowired  annotation.
    */
    StudyService(HelloService helloService, SportService sportService) {
        this.helloService = helloService;
        this.sportService = sportService;
    }

//    StudyService(){
//        System.out.println("init study service");
//    }

    @InitBinder
    public void initService() {
        System.out.println("init " + getClass().getSimpleName());
    }


    public void study() {
        System.out.println("hello, study!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
