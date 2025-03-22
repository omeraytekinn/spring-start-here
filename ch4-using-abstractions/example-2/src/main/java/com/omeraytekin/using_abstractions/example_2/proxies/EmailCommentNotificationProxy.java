package com.omeraytekin.using_abstractions.example_2.proxies;

import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_2.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Notifying Comment with Email: " + comment.getText());
    }
}
