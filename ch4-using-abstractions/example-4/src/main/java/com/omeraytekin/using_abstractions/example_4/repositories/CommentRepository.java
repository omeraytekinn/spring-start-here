package com.omeraytekin.using_abstractions.example_4.repositories;

import com.omeraytekin.using_abstractions.example_4.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}