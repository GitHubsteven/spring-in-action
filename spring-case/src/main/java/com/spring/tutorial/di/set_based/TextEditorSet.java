package com.spring.tutorial.di.set_based;

import com.spring.tutorial.di.SpellChecker;

public class TextEditorSet {
    private SpellChecker spellChecker;

    public TextEditorSet() {
        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public TextEditorSet setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        return this;
    }
}
