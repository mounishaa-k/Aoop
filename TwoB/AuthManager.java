package Twob;

public class AuthManager {
    private static AuthManager instance;
    private String loggedInUser;

    private AuthManager() {}

    public static AuthManager getInstance() {
        if (instance == null) {
            instance = new AuthManager();
        }
        return instance;
    }

    public void initiateSession(String username, String password) {
        loggedInUser = username;
        System.out.println("Session initiated for user: " + username);
    }

    public String getLoggedInUser() {
        System.out.println("Logged-in user: " + loggedInUser);
        return loggedInUser;
    }
}
