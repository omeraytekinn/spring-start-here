package com.omeraytekin.using_abstractions.example_2.repositories;

import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_2.models.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment to DB: " + comment.getText());
    }
}
