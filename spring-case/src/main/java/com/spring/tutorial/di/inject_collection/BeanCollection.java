package com.spring.tutorial.di.inject_collection;

import com.spring.tutorial.di.constructor_based.MoreParamDI;

import java.util.List;

public class BeanCollection {
    List<MoreParamDI> beanList;
    MoreParamDI special;

    public List<MoreParamDI> getBeanList() {
        beanList.forEach(MoreParamDI::introduce);
        return beanList;
    }

    public BeanCollection setBeanList(List<MoreParamDI> beanList) {
        this.beanList = beanList;
        return this;
    }

    public MoreParamDI getSpecial() {
        return special;
    }

    public BeanCollection setSpecial(MoreParamDI special) {
        this.special = special;
        return this;
    }
}
