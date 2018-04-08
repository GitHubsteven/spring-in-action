package com.spring.tutorial.app.di;

import com.spring.tutorial.app.BaseSpringApp;
import com.spring.tutorial.di.inject_collection.JavaCollection;

public class InCollectionApp extends BaseSpringApp {
    public static void main(String[] args) {
        JavaCollection javaCollection = getContext().getBean(JavaCollection.class);
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
    }
}
