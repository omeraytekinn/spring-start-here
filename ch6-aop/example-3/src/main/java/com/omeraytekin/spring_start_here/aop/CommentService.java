package com.omeraytekin.spring_start_here.aop;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
        return "SUCCESSED";
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
