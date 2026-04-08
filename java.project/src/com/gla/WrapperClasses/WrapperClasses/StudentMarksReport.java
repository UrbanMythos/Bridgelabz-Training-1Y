package WrapperClasses;import java.util.ArrayList;

public class StudentMarksReport {

    public static void main(String[] args) {

        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object mark : marks) {
            try {
                if (mark == null) continue;

                Integer value = null;

                if (mark instanceof String) {
                    String str = (String) mark;
                    if (str.equalsIgnoreCase("null")) continue;
                    value = Integer.parseInt(str);
                } else if (mark instanceof Integer) {
                    value = (Integer) mark;
                } else if (mark instanceof Double) {
                    value = ((Double) mark).intValue();
                }

                if (value != null) {
                    validMarks.add(value);
                }

            } catch (NumberFormatException e) {
            }
        }

        int sum = 0;
        for (Integer m : validMarks) {
            sum += m;
        }

        double average = validMarks.isEmpty() ? 0.0 : (double) sum / validMarks.size();

        System.out.println("Valid marks = " + validMarks);
        System.out.println("Average marks = " + average);
    }
}