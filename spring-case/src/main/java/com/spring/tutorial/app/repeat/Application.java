package com.spring.tutorial.app.repeat;

import com.spring.tutorial.repeat.configure.DiConfiguration;
import com.spring.tutorial.repeat.inbound.WmsInBlankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: jet.xie
 * @Date: 2018/7/9
 * @Time: 14:41
 * @Description:
 * @version: 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfiguration.class);
        WmsInBlankService bean = context.getBean(WmsInBlankService.class);
        bean.method();
    }
}