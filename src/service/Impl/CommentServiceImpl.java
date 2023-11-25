package service.Impl;


import model.entity.Comment;
import model.entity.Users;
import repository.CommentRepository;
import service.CommentService;

import java.util.ArrayList;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    CommentRepository repository = new CommentRepository();
    @Override
    public void save(Comment comment) {
        repository.save(comment);
    }


    @Override
    public List<Comment> setComment(List<Comment> comments, Comment comment){
//        save(comment);
        List<Comment> commentList = new ArrayList<>();
        if (repository.getAll() != null){
            commentList.add(comment);
            return commentList;
        } else {
            comments.add(comment);
            return comments;
        }
    }

    @Override
    public Comment createNewComment(Users users, String description) {
        Comment comment = new Comment(users, description);
        save(comment);
        return comment;
    }

    @Override
    public List<Comment> getAll() {
        return repository.getAll();
    }


}
