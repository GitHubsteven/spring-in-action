package com.spring.tutorial.app.di.inject_inner;

import com.spring.tutorial.app.BaseSpringApp;
import com.spring.tutorial.di.set_based.TextEditorSet;

public class InnerInjectApp extends BaseSpringApp {
    public static void main(String[] args) {
        TextEditorSet textEditorSet1 = (TextEditorSet) getContext().getBean("textEditorSet1");
        textEditorSet1.spellCheck();
    }
}
