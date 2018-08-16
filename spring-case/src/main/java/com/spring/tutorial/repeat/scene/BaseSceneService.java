package com.spring.tutorial.repeat.scene;

import com.spring.custom.annotation.MyService;
import com.spring.tutorial.repeat.scene.spring.lifecycle.AutoWiredMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 16:25
 * @Description:
 * @version: 1.0.0
 */
public class BaseSceneService {
    private String contextName;
    private String nextContext;

    @Autowired
    private AutoWiredMe me;

    private AutoWiredMe me2;

    public boolean match(String contextName) {
        return this.contextName.equalsIgnoreCase(contextName);
    }

    public void doBusiness() {
        System.out.println("I am " + contextName + " next ContextName is: " + nextContext);
    }

    public void setParam(String contextName, String nextContext) {
        this.contextName = contextName;
        this.nextContext = nextContext;
    }

    public void whoAmI() {
        me.whoIam();
    }

    public void whoAmI2() {
        me2.whoIam();
    }
}