package com.spring.tutorial.repeat;

import com.spring.tutorial.repeat.scene.BaseSceneService;
import com.spring.tutorial.repeat.scene.SceneOneService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.tutorial.BaseServiceTest;

import java.util.Map;

import static org.junit.Assert.*;

public class BusinessServiceTest extends BaseServiceTest {

    @Autowired
    private BusinessService businessService;
    @Autowired
    private SceneOneService sceneOneService;
    @Autowired
    private Map<String, BaseSceneService> sceneServiceMap;

    @Test
    public void getService() {
        String contextName = "sceneTwo";
        BaseSceneService service = businessService.getService(contextName);
        service.doBusiness();
    }

    @Test
    public void inJectMe() {
        sceneOneService.whoAmI();
        sceneOneService.whoAmI2();
    }
}