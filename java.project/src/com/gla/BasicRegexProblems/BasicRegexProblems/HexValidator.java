package BasicRegexProblems;
import java.util.regex.Pattern;

public class HexValidator {

    private static final String HEX_PATTERN = "^#[0-9A-Fa-f]{6}$";

    public static boolean isValidHex(String hex) {
        return hex != null && Pattern.matches(HEX_PATTERN, hex);
    }

    public static void main(String[] args) {
        System.out.println("#FFA500: " + isValidHex("#FFA500"));
        System.out.println("#ff4500: " + isValidHex("#ff4500"));
        System.out.println("#123: " + isValidHex("#123"));
    }
}