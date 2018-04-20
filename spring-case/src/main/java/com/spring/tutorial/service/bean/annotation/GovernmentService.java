package com.spring.tutorial.service.bean.annotation;

import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 13:36 2018/4/20.
 */
@Component
public class GovernmentService implements IWorkService {
    @Override
    public void whatsWork() {
        System.out.println("I am government ...");
    }
}
