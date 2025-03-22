package com.omeraytekin.using_abstractions.example_3.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_3.models.Comment;

@Component
@Primary
public class PushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Notifying Comment with Push Notification: " + comment.getText());
    }
}
