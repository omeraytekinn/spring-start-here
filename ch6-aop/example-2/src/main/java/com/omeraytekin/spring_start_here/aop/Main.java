package com.omeraytekin.spring_start_here.aop;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws BeansException {
        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = ctx.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("omeraytekin");
        service.publishComment(comment);
        service.editComment(comment);
        service.deleteComment(comment);
        System.out.println(service.getClass().getName());
        ctx.close();
    }
}