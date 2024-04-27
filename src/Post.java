import java.util.ArrayList;
import java.time.LocalDateTime;


public class Post {
    static int counter = 1;
    final private int id;
    private profile author;
    private String content;
    private LocalDateTime timestamp;
    private ArrayList<comment> comments;
    private ArrayList<profile> likes;

    public Post(String content, profile author) {
        this.id = counter;
        this.content = content;
        this.author = author;
        this.timestamp = LocalDateTime.now();
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
        counter++;

    }

    public ArrayList<comment> getComments() {
        return comments;
    }

    public ArrayList<profile> getLikes() {
        return likes;
    }

    public profile getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void addComment(profile a , String c) {
        comments.add(new comment(a , c));
    }
    public void removeComment(comment mycomment) {
        comments.remove(mycomment);
    }

    public void toggleLike(profile user) {
        if (likes.contains(user)){
            likes.remove(user);
        }
        else {
            likes.add(user);
        }
    }

    public int likeCount(){
        return comments.size();
    }

    public int commentCount(){
        return likes.size();
    }

    @Override
    public String toString() {
        return "author= " + author.getUsername() + '|' +
                "content= " + content + '|' +
                "comments= " + comments.size() +'|' +
                "likes= " + likes.size() ;
    }

}
