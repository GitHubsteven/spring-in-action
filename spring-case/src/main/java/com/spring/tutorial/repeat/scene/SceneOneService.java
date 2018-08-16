package com.spring.tutorial.repeat.scene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 16:27
 * @Description:
 * @version: 1.0.0
 */
@Service
public class SceneOneService extends BaseSceneService {
    private static final String contextName = "sceneOne";
    private static final String nextContext = "sceneTwo";


    @Autowired
    public void setParam() {
        super.setParam(contextName, nextContext);
    }

    @PostConstruct
    public void initHelp() {
        System.out.println("SceneOneService method annotated by postConstructor!");
    }

}