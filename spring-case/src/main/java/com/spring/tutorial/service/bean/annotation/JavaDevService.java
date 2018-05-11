package com.spring.tutorial.service.bean.annotation;

import com.spring.tutorial.service.activity.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 18:53 2018/5/10.
 */
@Service
public class JavaDevService {


    @Autowired
    @Value("life1")
    @Order(0)
    private LifeService life1;

    private LifeService life2 = new LifeService("life2");


    public void knowBasic(){
        System.out.println("start to learn java basic");
    }
}
