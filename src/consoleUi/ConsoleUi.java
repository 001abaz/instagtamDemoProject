package consoleUi;
import model.dto.UserMainPageDTO;
import model.entity.Post;
import model.entity.Users;
import service.CommentService;
import service.Impl.CommentServiceImpl;
import service.Impl.PostServiceImpl;
import service.Impl.UserServiceImpl;
import service.PostService;
import service.UserService;

import java.util.List;
import java.util.Scanner;
public class ConsoleUi {
    Scanner in = new Scanner(System.in);
    Users user = new Users();
    UserService service = new UserServiceImpl();
    PostService postService = new PostServiceImpl();
    CommentService commentService = new CommentServiceImpl();
    UserMainPageDTO dto = new UserMainPageDTO();
    public void show(Users user){
        System.out.println("Main page");
        System.out.println(dto.ShowCountOfFollowing(user));
        System.out.println(dto.ShowMainPage(user));
    }

    public void setLikes(Post post, Users user){
        System.out.println("Do you want put a like to this post\n y/n");
        String ans = in.next();
        if (ans.equals("y")){
            post.setLikes(postService.setLikes(post, user));
        }
    }
    public void setComment(Post post, Users user){
        System.out.println("Do you want write your comment to this post\n y/n");
        String ans = in.next();
        if (ans.equals("y")){
            System.out.println("Write your comment -> ");
            String description = in.next();
            post.setComments(commentService.setComment(post.getComments(),commentService.createNewComment(user, description)));
//            post.setComments(postService.setComment(post.getComments(), user, description));
            postService.save(post);
        }
    }

    public void authorized(){
        System.out.println("Authorized");
        System.out.println("Sig in - 1 \nSign Up - 2");
        int sing = in.nextInt();
        if (sing == 1){
            System.out.println("Input your username");
            String userName = in.next() ;
            System.out.println(service.getByUsername(userName));
            if (service.getByUsername(userName)){
                System.out.println("Input your password");
                String password = in.next();
                if (password.equals(user.getPassWord())){
                    System.out.println("Authorized is successful");

                }
            }else {
                System.out.println("User name is not correct");
            }
        }


    }
}
