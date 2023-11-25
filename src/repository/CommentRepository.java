package repository;

import model.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {

    List<Comment> db = new ArrayList<>();

    public void save(Comment comment){
        db.add(comment);
    }
    public Comment getById(int id){
        return db.get(id);
    }
    public void deleteById(int id){
        db.remove(id);
    }

    public List<Comment> getAll(){
        return db;
    }
}
