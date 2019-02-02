package newblogpost;
import java.util.*;

public class Blog {
    ArrayList<BlogPost> blogPosts;

    public Blog(){
        blogPosts =new ArrayList<>();
     }

     public void delete(int a ){
        blogPosts.remove(a);
     }
     public void update(int i,BlogPost newBlog){
        blogPosts.set(i, new BlogPost());
     }

}
