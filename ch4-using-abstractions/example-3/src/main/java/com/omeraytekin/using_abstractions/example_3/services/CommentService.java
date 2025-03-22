package com.omeraytekin.using_abstractions.example_3.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_3.models.Comment;
import com.omeraytekin.using_abstractions.example_3.proxies.CommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_3.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(@Qualifier("IN_MEMORY") CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}