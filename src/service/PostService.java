package service;

import model.entity.Comment;
import model.entity.Post;
import model.entity.Users;

import java.util.List;

public interface PostService {
    void save(Post post);

    Post getById(int id);

    List<Post> getAll();
    void delete(int id);
    List<Users> setLikes(Post post, Users users);
    List<Comment> setComment(List<Comment> comments, Users user, String description);


}
