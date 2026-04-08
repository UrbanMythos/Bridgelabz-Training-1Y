package ThreadsinJava;
import java.text.SimpleDateFormat;
import java.util.Date;

class SmartDevice implements Runnable {
    private String deviceName;
    private int interval;

    public SmartDevice(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    private String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "[" + getTime() + "] " +
                            deviceName +
                            " | Priority: " + currentThread.getPriority() +
                            " | Cycle: " + i + "/5"
            );

            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted.");
            }
        }

        System.out.println(deviceName + " has completed all cycles.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        // Create devices
        SmartDevice tempSensor = new SmartDevice("Temperature Sensor", 5);
        SmartDevice securityCamera = new SmartDevice("Security Camera", 3);
        SmartDevice lightController = new SmartDevice("Light Controller", 4);
        SmartDevice doorLock = new SmartDevice("Door Lock Monitor", 6);

        // Create threads
        Thread t1 = new Thread(tempSensor);
        Thread t2 = new Thread(securityCamera);
        Thread t3 = new Thread(lightController);
        Thread t4 = new Thread(doorLock);

        // Set priorities
        t2.setPriority(Thread.MAX_PRIORITY); // Security = 10
        t1.setPriority(7);                   // Temperature = 7
        t3.setPriority(Thread.NORM_PRIORITY); // Light = 5
        t4.setPriority(Thread.NORM_PRIORITY); // Door = 5

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Ensure main waits for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nAll smart home devices have finished execution.");
    }
}