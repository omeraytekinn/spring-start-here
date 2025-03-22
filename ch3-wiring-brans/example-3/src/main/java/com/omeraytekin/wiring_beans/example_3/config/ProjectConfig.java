package com.omeraytekin.wiring_beans.example_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.omeraytekin.wiring_beans.example_3.main.Parrot;

@Configuration
@ComponentScan(basePackages = "com.omeraytekin.wiring_beans.example_3.main")
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
