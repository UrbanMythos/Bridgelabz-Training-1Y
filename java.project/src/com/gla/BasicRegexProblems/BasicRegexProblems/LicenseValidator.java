package BasicRegexProblems;
import java.util.regex.Pattern;

public class LicenseValidator {

    private static final String PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";

    public static boolean isValidPlate(String plate) {
        return plate != null && Pattern.matches(PLATE_PATTERN, plate);
    }

    public static void main(String[] args) {
        System.out.println("AB1234: " + isValidPlate("AB1234"));
        System.out.println("A12345: " + isValidPlate("A12345"));
    }
}