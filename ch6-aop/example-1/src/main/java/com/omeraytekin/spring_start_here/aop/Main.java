package com.omeraytekin.spring_start_here.aop;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws BeansException {
        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = ctx.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("omeraytekin");
        String value = service.publishComment(comment);
        logger.info(value);
        ctx.close();
    }
}