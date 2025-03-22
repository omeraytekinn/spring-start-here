package com.omeraytekin.using_abstractions.example_3.repositories;

import com.omeraytekin.using_abstractions.example_3.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}