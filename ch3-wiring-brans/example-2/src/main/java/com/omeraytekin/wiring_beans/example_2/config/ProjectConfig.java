package com.omeraytekin.wiring_beans.example_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.omeraytekin.wiring_beans.example_2.main.Parrot;
import com.omeraytekin.wiring_beans.example_2.main.Person;

@Configuration
public class ProjectConfig {
    @Bean
    Person person(Parrot parrot) {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
