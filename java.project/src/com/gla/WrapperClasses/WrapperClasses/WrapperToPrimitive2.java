package WrapperClasses;
public class WrapperToPrimitive2 {
    public static void main(String[] args) {
        // Given Double object
        Double obj = 45.67;

        double doubleValue = obj;

        int intValue = (int) doubleValue;

        System.out.println("Double object value: " + obj);
        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Primitive int value (after casting): " + intValue);
    }
}