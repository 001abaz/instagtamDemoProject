package model.entity;

import model.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class Comment extends BaseEntity{
    private Users users;
    private String description;

    public Comment(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, Users users, String description) {
        super(id, createdDate, updatedDate, status);
        this.users = users;
        this.description = description;
    }
    public Comment(Users users, String description){
        this.users = users;
        this.description = description;
    }

    public Users getUsers() {
        return users;
    }
    public String getDescription() {
        return description;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "users=" + users +
                ", description='" + description + '\'' +
                '}';
    }
}
