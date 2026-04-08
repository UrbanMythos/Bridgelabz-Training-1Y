package WrapperClasses;

public class UserValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input); // convert String to int

            if (age >= 18) {
                return true;
            } else {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] testInputs = {"20", "17", "abc", "18"};

        for (String input : testInputs) {
            System.out.println("Input: " + input + " -> Valid: " + isValidAge(input));
        }
    }
}
