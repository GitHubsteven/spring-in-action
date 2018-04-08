package com.spring.tutorial.di.set_based;

import com.spring.tutorial.di.SpellChecker;

public class MoreParamDISet {
    private String name;
    private int age;
    private SpellChecker spellChecker;

    public void introduce() {
        System.out.println("hell, I am:" + this.name + "and " + this.age + "old");
        this.spellChecker.checkSpelling();
    }

    public String getName() {
        return name;
    }

    public MoreParamDISet setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public MoreParamDISet setAge(int age) {
        this.age = age;
        return this;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public MoreParamDISet setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        return this;
    }
}
