package com.spring.tutorial.service.manage;

import com.spring.tutorial.service.bean.annotation.IWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 13:40 2018/4/20.
 */
@Service
public class JobManager {
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
        workService.whatsWork();
    }

    public void introduceJob() {
        jobs.forEach((name, service) -> {

            System.out.println("============" + name);
            service.whatsWork();
        });
    }
}
