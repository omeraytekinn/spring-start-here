package com.omeraytekin.using_abstractions.example_4.services;

import org.springframework.stereotype.Service;

import com.omeraytekin.using_abstractions.example_4.models.Comment;
import com.omeraytekin.using_abstractions.example_4.proxies.CommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_4.repositories.CommentRepository;

@Service
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