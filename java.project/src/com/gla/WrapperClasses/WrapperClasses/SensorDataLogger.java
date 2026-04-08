package WrapperClasses;
import java.util.ArrayList;

public class SensorDataLogger {

    private ArrayList<Double> temperatureLog = new ArrayList<>();

    public void logTemperature(Double temp) {
        if (temp != null) {
            temperatureLog.add(temp);
        }
    }

    public double getAverageTemperature() {
        if (temperatureLog.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double t : temperatureLog) {
            sum += t;
        }

        return sum / temperatureLog.size();
    }

    public static void main(String[] args) {

        SensorDataLogger logger = new SensorDataLogger();

        double temp1 = 25.5;
        Double temp2 = 30.0;
        double temp3 = 28.3;

        logger.logTemperature(temp1);
        logger.logTemperature(temp2);
        logger.logTemperature(temp3);

        System.out.println("Average Temperature = " + logger.getAverageTemperature());
    }
}