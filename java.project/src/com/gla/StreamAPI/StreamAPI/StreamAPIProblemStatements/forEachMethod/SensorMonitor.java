package StreamAPI.StreamAPIProblemStatements.forEachMethod;
import java.util.*;

public class SensorMonitor {
    public static void main(String[] args) {
        double threshold = 75.0;
        List<Double> readings = Arrays.asList(65.5, 82.0, 78.3, 72.1, 91.5, 68.9);

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Alert: High reading detected - " + r));
    }
}