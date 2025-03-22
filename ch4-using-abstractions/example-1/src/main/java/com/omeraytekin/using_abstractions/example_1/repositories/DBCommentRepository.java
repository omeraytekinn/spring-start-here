package com.omeraytekin.using_abstractions.example_1.repositories;

import com.omeraytekin.using_abstractions.example_1.models.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment to DB: " + comment.getText());
    }
}
