package com.omeraytekin.using_abstractions.example_1.repositories;

import com.omeraytekin.using_abstractions.example_1.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}