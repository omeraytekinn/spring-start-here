package com.omeraytekin.defining_beans.example_2.main;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.defining_beans.example_2.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot1 = new Parrot();
        parrot1.setName("parrot1");
        Supplier<Parrot> parrot1Supplier = () -> parrot1;
        Parrot parrot2 = new Parrot();
        parrot2.setName("parrot2");
        Supplier<Parrot> parrot2Supplier = () -> parrot2;

        context.registerBean("parrot1", Parrot.class, parrot1Supplier, bc -> bc.setPrimary(true));
        context.registerBean("parrot2", Parrot.class, parrot2Supplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }
}