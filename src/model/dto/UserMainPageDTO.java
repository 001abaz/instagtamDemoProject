package model.dto;

import model.entity.Post;
import model.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class UserMainPageDTO {
    Post post = new Post();
    Users user = new Users();
    Users following = new Users();

    public List<Post> ShowMainPage(Users users){
        List<Post> MainPageContent = new ArrayList<>();

        List<Users> followingUsers = new ArrayList<>(users.getFollowing());
        for (Users user : followingUsers){
            List<Post> userPosts = user.getPosts();
            if(userPosts != null) {
                MainPageContent.addAll(userPosts);
            }
        }
        return MainPageContent;
    }

    public int ShowCountOfFollowing(Users users){
        List<Users> followingUsers = new ArrayList<>(users.getFollowing());
        return followingUsers.size();
    }


}
