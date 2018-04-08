package com.spring.tutorial.di.constructor_based;

import com.spring.tutorial.di.SpellChecker;

public class TextEditorNew {
    private SpellChecker spellChecker;
    private String name;

    public TextEditorNew setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        return this;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public TextEditorNew setName(String name) {
        this.name = name;
        return this;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
