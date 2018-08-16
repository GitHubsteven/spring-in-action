package com.spring.tutorial.repeat;

import com.spring.tutorial.repeat.scene.BaseSceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 16:24
 * @Description:
 * @version: 1.0.0
 */
@Service
public class BusinessService {
    @Autowired
    Map<String, BaseSceneService> sceneServiceMap;

    public BaseSceneService getService(String contextName) {
        return sceneServiceMap.values().stream()
                .filter(it -> it.match(contextName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("没有找到" + contextName + "Service"));
    }

}