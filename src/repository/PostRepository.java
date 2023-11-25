package repository;

import model.entity.Post;
import model.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private List<Post> db = new ArrayList<>();

    public void save(Post post){
        db.add(post);
    }
    public List<Post> getAll(){
        return db;
    }

    public Post getById(int id){
        return db.get(id);
    }
    public void delete(int id){
        db.remove(id);
    }


}
