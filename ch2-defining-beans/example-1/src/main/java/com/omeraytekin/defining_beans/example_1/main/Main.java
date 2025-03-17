package com.omeraytekin.defining_beans.example_1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.defining_beans.example_1.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
        p = context.getBean("Riki", Parrot.class);
        System.out.println(p.getName());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer i = context.getBean(Integer.class);
        System.out.println(i);
    }
}