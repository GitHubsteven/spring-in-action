package com.spring.tutorial.app.di;

import com.spring.tutorial.app.BaseSpringApp;
import com.spring.tutorial.di.set_based.MoreParamDISet;
import org.springframework.context.ApplicationContext;

public class SetBasedApp extends BaseSpringApp {
    public static void main(String[] args) {
        ApplicationContext context = getContext();

//        TextEditorSet textEditorSet = context.getBean(TextEditorSet.class);
//        textEditorSet.spellCheck();

        MoreParamDISet moreParamDISet = context.getBean(MoreParamDISet.class);
        moreParamDISet.introduce();
    }
}
