package com.omeraytekin.using_abstractions.example_2.repositories;

import com.omeraytekin.using_abstractions.example_2.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}