package com.omeraytekin.defining_beans.example_4.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.defining_beans.example_4.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Person person = context.getBean(Person.class);
            Parrot parrot = context.getBean(Parrot.class);
            System.out.println("Person's name: " + person.getName());
            System.out.println("Parrot's name: " + parrot.getName());
            System.out.println("Person's parrot: " + person.getParrot());
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}