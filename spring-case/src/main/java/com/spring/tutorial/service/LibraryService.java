package com.spring.tutorial.service;

public class LibraryService {
    private String name;

    public void close() {
        System.out.println("library is to be closed");
    }

    public String getName() {
        return name;
    }

    public LibraryService setName(String name) {
        this.name = name;
        return this;
    }
}
