import java.util.ArrayList;

public class profile {
    private String username;
    private String password;
    private String bio;
    private String profilePic;
    private ArrayList<profile> followlist;
    private ArrayList<Post> Postlist;



    public profile(String username, String password, String bio, String profilePic) {
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.profilePic = profilePic;
        this.followlist = new ArrayList<>();
        this.Postlist = new ArrayList<>();
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public ArrayList<Post> getPostlist() {
        return Postlist;
    }

    public ArrayList<profile> getFollowlist() {
        return followlist;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void addFriend(profile user){
        if (!followlist.contains(user)){
            followlist.add(user);
        }
    }

    public void addpost(String content ){
        Postlist.add(new Post(content,this));
    }

    @Override
    public String toString() {
        return  "username='" + username + '|' +
                ", bio='" + bio + '|' +
                ", profilePictureUrl='" + profilePic + '|' +
                ", friendsCount=" + followlist.size() +
                ", postsCount=" + Postlist.size();
    }


}
