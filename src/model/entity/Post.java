package model.entity;

import model.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post extends BaseEntity{

    private Users users;
    private List<Users> likes;
    private List<Comment> comments;
    private String description;
    private String location;

    public Post(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, Users users, List<Users> likes, List<Comment>  comments, String description, String location) {
        super(id, createdDate, updatedDate, status);
        this.users = users;
        this.likes = likes;
        this.comments = comments;
        this.description = description;
        this.location = location;
    }
    public Post(Users users){
    }
    public Post(){
    }

    public Users getUsers() {
        return users;
    }

    public List<Users> getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }


    public void setUsers(Users users) {
        this.users = users;
    }

    public void setLikes(List<Users> likes) {
        this.likes = likes;
    }


    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Post{" +
//                ", likes=" + likes +
                ", comments=" + comments +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
