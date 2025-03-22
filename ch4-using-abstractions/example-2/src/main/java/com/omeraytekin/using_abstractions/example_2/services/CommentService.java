package com.omeraytekin.using_abstractions.example_2.services;

import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_2.models.Comment;
import com.omeraytekin.using_abstractions.example_2.proxies.CommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_2.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}