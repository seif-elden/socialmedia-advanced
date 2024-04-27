import java.util.HashMap;
import java.util.Map;

public class NetworkService {
    private Map<String, profile> profiles = new HashMap<>();

    public boolean registerUser(String username , String password , String bio, String profilePicUrl) {
        if (!profiles.containsKey(username)) {
            profiles.put(username, new profile(username, password , bio, profilePicUrl));
            return true;
        }
        return false; // User already exists
    }

    public profile loginUser(String username, String password) {
        profile user = profiles.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null; // Login failed
    }


}

