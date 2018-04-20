package com.spring.tutorial.service.activity;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    private String name;

    public void hello(){
        System.out.println("hello, library...");
    }

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
