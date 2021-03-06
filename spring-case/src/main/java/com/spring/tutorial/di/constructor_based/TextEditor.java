package com.spring.tutorial.di.constructor_based;

import com.spring.tutorial.di.SpellChecker;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public TextEditor setName(String name) {
        this.name = name;
        return this;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
