package com.omeraytekin.using_abstractions.example_2.proxies;

import com.omeraytekin.using_abstractions.example_2.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
