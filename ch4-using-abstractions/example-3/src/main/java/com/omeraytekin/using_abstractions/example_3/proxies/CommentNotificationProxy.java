package com.omeraytekin.using_abstractions.example_3.proxies;

import com.omeraytekin.using_abstractions.example_3.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
