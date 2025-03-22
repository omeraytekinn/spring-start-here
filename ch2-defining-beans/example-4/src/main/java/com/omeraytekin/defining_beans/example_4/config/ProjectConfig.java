package com.omeraytekin.defining_beans.example_4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.omeraytekin.defining_beans.example_4.main.Parrot;
import com.omeraytekin.defining_beans.example_4.main.Person;

@Configuration
public class ProjectConfig {
    public ProjectConfig() {
        System.out.println("ProjectConfig instance created");
    }

    @Bean
    @Primary
    Person person() {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());
        // See that parrot bean worked only one time
        p.setParrot(parrot());
        return p;
    }

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Person changePersonName() {
        var p = person();
        // See that even this bean is not primary name changed
        p.setName("Jon");
        return p;
    }
}
