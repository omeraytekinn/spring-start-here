package com.omeraytekin.using_abstractions.example_1.main;

import com.omeraytekin.using_abstractions.example_1.models.Comment;
import com.omeraytekin.using_abstractions.example_1.proxies.CommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_1.proxies.EmailCommentNotificationProxy;
import com.omeraytekin.using_abstractions.example_1.repositories.CommentRepository;
import com.omeraytekin.using_abstractions.example_1.repositories.DBCommentRepository;
import com.omeraytekin.using_abstractions.example_1.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        Comment comment = new Comment("Demo Comment.", "Demo Author");
        commentService.publishComment(comment);
    }
}