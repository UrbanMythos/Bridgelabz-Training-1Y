package BasicRegexProblems;
import java.util.regex.Pattern;

public class UsernameValidator {

    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    public static boolean isValid(String username) {
        if (username == null) {
            return false;
        }
        return Pattern.matches(USERNAME_PATTERN, username);
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us", "valid_user_name"};

        for (String user : testUsernames) {
            System.out.println(user + " is valid: " + isValid(user));
        }
    }
}