package com.omeraytekin.wiring_beans.example_4.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.wiring_beans.example_4.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Person person = context.getBean(Person.class);
            Customer customer = context.getBean(Customer.class);
            System.out.println("Person's name: " + person.getName());
            System.out.println("Person's parrot: " + person.getParrot());
            System.out.println("Customer's name: " + customer.getName());
            System.out.println("Customer's parrot: " + customer.getParrot());
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}