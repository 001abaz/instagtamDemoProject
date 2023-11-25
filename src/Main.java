import consoleUi.ConsoleUi;
import model.entity.Comment;
import model.entity.Post;
import model.entity.Users;
import model.enums.Status;
import service.CommentService;
import service.Impl.CommentServiceImpl;
import service.Impl.PostServiceImpl;
import service.Impl.UserServiceImpl;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Users user = new Users();

        CommentService comService = new CommentServiceImpl();
        PostServiceImpl postService = new PostServiceImpl();
        ConsoleUi console = new ConsoleUi();

        UserService service = new UserServiceImpl();
        System.out.println("Authorized");

        user.setId(1);
        user.setUserName("01abaz");
        user.setPassWord("1234");
        user.setName("Abaz");
        user.setDescription("Java Back end developer");
        user.setPosts(null);
        service.save(user);

        Comment comment = new Comment(user, "WOOOOOOOWWWWWWWWW");
        comService.save(comment);

        Users user1 = new Users();

        user1.setId(2);
        user1.setUserName("ErlanKubanychbekov");
        user1.setPassWord("1234");
        user1.setPosts(null);
        user1.setName("Erlan");
        user1.setDescription("Java Back end developer");
        user1.setFollowers(service.setFollowers(user));
        service.save(user1);

        Users user2 = new Users();

        user2.setId(3);
        user2.setUserName("abdurahimBV");
        user2.setPassWord("1234");
        user2.setName("Abdurahim");
        user2.setDescription("Front-End developer");
        user2.setFollowers(service.setFollowers(user));
        service.save(user2);

//        List<Users> usersList = new ArrayList<>();
//        usersList.add(user);
//        usersList.add(user1);
//        usersList.add(user2);
//        service.saveAll(usersList);


        Post post = new Post();
        post.setId(1);
        post.setUsers(user);
        postService.setLikes(post, user);
        post.setDescription("First Post for my followers");
        post.setLocation("Bishkek, Kyrgyzstan");
        post.setComments(comService.setComment(post.getComments(), comment));
        postService.save(post);

        Comment comment1 = new Comment(user, "LLOOOOOOLLLLLLLL");
//
        comService.save(comment1);



        Post post1 = new Post();

        post1.setId(2);
        post1.setUsers(user1);
        postService.setLikes(post1, user2);
        post1.setDescription("My name is Erlan");
        post1.setLocation("Tokmok, Kyzyl-Asker, Kyrgyzstan");
        post1.setComments(comService.setComment(post1.getComments(), comment1));
        post1.setComments(comService.setComment(post1.getComments(), comment));
        postService.save(post1);

//        System.out.println("COOOOOOOOO" + post1.getComments());

        Post post2 = new Post();

        post2.setId(3);
        post2.setUsers(user2);
        postService.setLikes(post2, user1);
        post2.setDescription("I often play games");
        post2.setLocation("Batken, Kyzyl-Suu, Kyrgyzstan");
        postService.save(post2);

        user.setPosts(service.setPost(post, user));
        user.setPosts(service.setPost(post1, user));
        user2.setPosts(service.setPost(post2, user2));

        List<Users> FollowingList = new ArrayList<>();

        FollowingList.add(user1);
        FollowingList.add(user2);
        user.setFollowing(FollowingList);
        service.save(user);

        List<Users> FollowingList1 = new ArrayList<>();

        FollowingList1.add(user);
        FollowingList1.add(user2);
        user1.setFollowing(FollowingList1);
        service.save(user1);

        List<Users> FollowingList2 = new ArrayList<>();

        FollowingList2.add(user1);
        FollowingList2.add(user);
        user2.setFollowing(FollowingList2);
        service.save(user2);

        System.out.println(service.getPosts(user));


        System.out.println("get by id " + service.getById(0));
//        System.out.println(service.getById(1));
//        System.out.println(service.getAll());
//        System.out.println("Followers - " + service.countOfFollowers(user2));
//        System.out.println("Following - " + service.countOfFollowing(user));

//        System.out.println("Posts - " + service.countOfPosts(user));

//        console.authorized();
//        System.out.println(service.getUserName());
//        System.out.println(service.getAll());
//        System.out.println(postService.getById(0));
//
//        System.out.println(user.getFollowing());
//        console.show(user);
//        console.setLikes(post1, user);
//        System.out.println(post1.getLikes());
//        console.setLikes(post1, user2);
//        System.out.println(post1.getLikes().size());
//
//        console.setComment(post1, user);
//        System.out.println(post1.getComments());
        System.out.println(post1.getLikes());
        System.out.println(user.getPosts());

        System.out.println("get all " + service.getAll());


    }
}