package com.omeraytekin.using_abstractions.example_1.proxies;

import com.omeraytekin.using_abstractions.example_1.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Notifying Comment with Email: " + comment.getText());
    }
}
