package repository;

import model.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<Users> db = new ArrayList<>();
//    Users user = new Users();

    public void save(Users users){
        db.add(users);
    }
    public Users getById(int id) {
        return db.get(id);
    }

    public int countOfPosts(Users users){
        return users.getPosts().size();
    }

    public int countOfFollowers(Users users){
        return users.getFollowers().size();
    }
    public int countOfFollowing(Users user){
        return db.get(user.getId()).getFollowing().size();
    }
    public List<Users> getAllFollowers(Users user){
        return user.getFollowers();
    }
    public List<Users> getAllFollowing(Users user){
        return user.getFollowing();
    }

    public List<Users> getAll() {
        return db;
    }
    public String getName(Users user){
        return user.getName();
    }

    public boolean findByUsername(String userName){
        boolean a = false;
        for (Users user : db){
            if(user.getUserName().contains(userName)){
                a = true;
            }
        }
        return a;
    }
}
