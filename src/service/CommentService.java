package service;

import model.entity.Comment;
import model.entity.Users;

import java.util.List;

public interface CommentService {
    void save(Comment comment);
    List<Comment> setComment(List<Comment> comments, Comment comment);
    Comment createNewComment(Users users, String description);

    List<Comment> getAll();
}
