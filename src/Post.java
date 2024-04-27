import java.util.ArrayList;

public class Post {
    private profile author;
    private String content;
    private ArrayList<comment> comments;
    private ArrayList<profile> likes;

    public Post(String content, profile username) {
        this.content = content;
        this.author = username;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
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

    public void addComment(comment mycomment) {
        comments.add(mycomment);
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
}
