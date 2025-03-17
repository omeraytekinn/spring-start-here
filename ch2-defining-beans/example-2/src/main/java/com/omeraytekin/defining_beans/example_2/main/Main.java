package com.omeraytekin.defining_beans.example_2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.defining_beans.example_2.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}