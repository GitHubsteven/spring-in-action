package com.spring.tutorial.service.bean.annotation;

import com.spring.tutorial.service.activity.HelloService;
import com.spring.tutorial.service.activity.LifeService;
import com.spring.tutorial.service.activity.StudyService;
import com.spring.tutorial.service.activity.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:38 2018/4/5.
 */
@Service
public class TeacherService implements IWorkService{

    //inject by setter method
    private HelloService helloService;

    //inject by construct
    private final LifeService lifeService;

    private final StudyService studyService;

    //inject directly
    @Autowired
    private WorkService workService;

    private  String name;

    @Autowired
    TeacherService(LifeService lifeService, StudyService studyService){
        this.lifeService = lifeService;
        this.studyService = studyService;
    }

    public void teach(){
        workService.startWork();
        System.out.println("teaching ...");
        workService.endWork();
    }


    public String getName() {
        return name;
    }

//    @Required, if you set@required here, you have to set value when  initialize
    public void setName(final String name) {
        this.name = name;
    }

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void allDay(){
        helloService.hello();
        lifeService.life();
        studyService.study();
    }

    @Override
    public void whatsWork() {
        System.out.println("I am a teacher ...");
    }
}
