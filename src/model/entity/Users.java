package model.entity;

import model.enums.Status;

import java.security.Key;
import java.sql.Struct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users extends BaseEntity{

    private String userName;
    private String passWord;
    private String name;
    private String description;
    private List<Post> posts;
    private List<Users> followers;
    private List<Users> following;

    public Users(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String userName, String passWord, String name, String description, List<Post>  posts, List<Users> followers, List<Users> following) {
        super(id, createdDate, updatedDate, status);
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.description = description;
        this.posts = posts;
        this.followers = followers;
        this.following = following;
    }

    public Users() {
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Users> getFollowers() {
        return followers;
    }

    public List<Users> getFollowing() {
        return following;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setFollowers(List<Users> followers) {
        this.followers = followers;
    }

    public void setFollowing(List<Users> following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", followers=" + followers +
                '}';
    }
}
