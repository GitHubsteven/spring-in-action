package com.spring.tutorial.service.manage;

import com.spring.tutorial.service.bean.annotation.IWorkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 13:40 2018/4/20.
 */
@Service
public class JobManager {

    private static final Logger _$ = LoggerFactory.getLogger(JobManager.class);
    @Value("PuDong")
    private String area;
    /**
     * 1: specified the subClass for superClass or interface, if you do not do this, error
     * following will occur
     * <p>
     * type 'com.spring.tutorial.service.bean.annotation.IWorkService' available:
     * expected single matching bean but found 2: governmentService,teacherService
     */
    @Autowired
    @Qualifier("teacherService")
    private IWorkService workService;

    /**
     * 2 based on scenario 1, if you want inject all subclass of some class or interface,
     * default key is the subclass's name start with low character
     */
    @Autowired
    private Map<String, IWorkService> jobs;


    public void checkTeacher() {
        _$.info("log系统测试");
        workService.whatsWork();
    }

    public void introduceJob() {
        jobs.forEach((name, service) -> {
            System.out.println("============" + name);
            service.whatsWork();
        });
        System.out.println(1 /0);
    }

    @ExceptionHandler(Exception.class)
    public void handleExc() {
        System.out.println("catch the exception");
    }

}
