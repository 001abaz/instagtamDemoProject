package service;

import model.entity.Post;
import model.entity.Users;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    void save(Users users);
    List<Post> getPosts(Users user);
    void saveAll(List<Users> user);
//    int countOfPosts();

    int countOfPosts(Users users);

    int countOfFollowers(Users users);
    Users getById(int id);
    List<Users> getAll();
    List<Users> setFollowers(Users users);
    List<Users> setFollowing(Users user);

    List<Users> getAllFollowers(Users user);
    int countOfFollowing(Users user);
    List<Users>  getAllFollowing(Users user);
    boolean getByUsername(String userName);
    String getUserName();
    List<Post> setPost(Post post, Users user);

}
