package com.omeraytekin.using_abstractions.example_1.services;

import com.omeraytekin.using_abstractions.example_1.models.Comment;
import com.omeraytekin.using_abstractions.example_1.proxies.CommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_1.repositories.CommentRepository;

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