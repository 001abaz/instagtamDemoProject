package service.Impl;

import model.entity.Post;
import model.entity.Users;
import repository.UserRepository;
import service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository repository = new UserRepository();
    @Override
    public void save(Users users) {
        repository.save(users);
    }

    @Override
    public List<Post> getPosts(Users user) {
        return user.getPosts();

    }

    @Override
    public void saveAll(List<Users> users) {
        for (Users user : users){
            save(user);
        }
    }


    @Override
    public int countOfPosts(Users users) {
        return repository.countOfPosts(users);
    }

    @Override
    public int countOfFollowers(Users users) {
        return repository.countOfFollowers(users);
    }

    @Override
    public Users getById(int id) {
        return repository.getById(id);
    }
    @Override
    public String getUserName(){
        Users user = getById(0);
        return user.getUserName();
    }

    @Override
    public List<Post> setPost(Post post, Users user) {
        try {
            List<Post> posts = user.getPosts();
            if (posts.isEmpty()) {
                List<Post> newPost = new ArrayList<>();
                newPost.add(post);
                return newPost;
            } else {
                posts.add(post);
                return posts;
            }
        }catch (NullPointerException e){
//            System.out.println("First post " + e.getMessage());
            List<Post> posts = new ArrayList<>();
            posts.add(post);
            return posts;
        }

    }


    @Override
    public List<Users> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Users> setFollowers(Users users) {
        List<Users> followers = new ArrayList<>();
        followers.add(users);
        return followers;
    }

    @Override
    public List<Users> setFollowing(Users user) {
        List<Users> following = new ArrayList<>();
        following.add(user);
        return following;
    }


    @Override
    public List<Users> getAllFollowers(Users user) {
        return repository.getAllFollowers(user);
    }

    @Override
    public int countOfFollowing(Users user) {

        return repository.countOfFollowing(user);
    }

    @Override
    public List<Users>  getAllFollowing(Users user) {
        return repository.getAllFollowing(user);
    }

    @Override
    public boolean getByUsername(String userName) {
        return repository.findByUsername(userName);
    }


}
