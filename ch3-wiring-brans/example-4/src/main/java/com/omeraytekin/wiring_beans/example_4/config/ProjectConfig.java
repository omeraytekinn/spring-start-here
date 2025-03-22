package com.omeraytekin.wiring_beans.example_4.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.omeraytekin.wiring_beans.example_4.main.Parrot;
import com.omeraytekin.wiring_beans.example_4.main.Person;

@Configuration
@ComponentScan(basePackages = "com.omeraytekin.wiring_beans.example_4.main")
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean(name = "customer-parrot")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Tiki");
        return p;
    }

    @Bean
    Person person(@Qualifier("parrot2") Parrot parrot2) {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
