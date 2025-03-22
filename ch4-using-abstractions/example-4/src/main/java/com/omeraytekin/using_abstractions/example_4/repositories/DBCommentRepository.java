package com.omeraytekin.using_abstractions.example_4.repositories;

import org.springframework.stereotype.Repository;

import com.omeraytekin.using_abstractions.example_4.models.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment to DB: " + comment.getText());
    }
}
