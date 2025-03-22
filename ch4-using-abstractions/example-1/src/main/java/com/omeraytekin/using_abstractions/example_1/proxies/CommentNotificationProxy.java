package com.omeraytekin.using_abstractions.example_1.proxies;

import com.omeraytekin.using_abstractions.example_1.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
