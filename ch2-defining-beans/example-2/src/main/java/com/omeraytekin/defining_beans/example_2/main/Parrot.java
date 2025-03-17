package com.omeraytekin.defining_beans.example_2.main;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct çalıştı!");
        this.name = "Kiki";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Parrot class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
