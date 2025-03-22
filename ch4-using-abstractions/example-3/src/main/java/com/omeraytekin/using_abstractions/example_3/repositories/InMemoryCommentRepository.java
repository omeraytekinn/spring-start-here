package com.omeraytekin.using_abstractions.example_3.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.omeraytekin.using_abstractions.example_3.models.Comment;

@Component
@Qualifier("IN_MEMORY")
public class InMemoryCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment to In Memory: " + comment.getText());
    }
}
