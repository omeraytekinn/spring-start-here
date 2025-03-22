package com.omeraytekin.using_abstractions.example_2.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omeraytekin.using_abstractions.example_2.config.ProjectConfig;
import com.omeraytekin.using_abstractions.example_2.models.Comment;
import com.omeraytekin.using_abstractions.example_2.services.CommentService;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            CommentService commentService = context.getBean(CommentService.class);
            Comment comment = new Comment("Demo Comment.", "Demo Author");
            commentService.publishComment(comment);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}