package service.Impl;

import model.entity.Comment;
import model.entity.Post;
import model.entity.Users;
import repository.PostRepository;
import service.CommentService;
import service.PostService;

import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostService {

    PostRepository repository = new PostRepository();
    CommentService comService = new CommentServiceImpl();

    @Override
    public void save(Post post) {
        repository.save(post);
    }

    @Override
    public Post getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Post> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public List<Users> setLikes(Post post, Users user) {
        try {
            List<Users> likes = post.getLikes();
            likes.add(user);
            return likes;
        }catch (NullPointerException e) {
            System.out.println("First like ");
            List<Users> newLike = new ArrayList<>();
            newLike.add(user);
            return newLike;
        }
    }

    @Override
    public List<Comment> setComment(List<Comment> comments, Users user, String description) {
        List<Comment> commentList = new ArrayList<>();
        Comment comment = new Comment(user, description);
        comService.save(comment);
//        comment.setUsers(user);
//        comment.setDescription(description);
//        commentList.addAll(comments);
        commentList.add(comment);
        return commentList;
    }


}
