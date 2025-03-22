package com.omeraytekin.using_abstractions.example_4.proxies;

import com.omeraytekin.using_abstractions.example_4.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
