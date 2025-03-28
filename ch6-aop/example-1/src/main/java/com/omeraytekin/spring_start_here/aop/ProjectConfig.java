package com.omeraytekin.spring_start_here.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.omeraytekin.spring_start_here.aop")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
