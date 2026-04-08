package ThreadsinJava;
class ExamActivity implements Runnable {
    private String activityName;
    private int startDelay;
    private int duration;

    public ExamActivity(String activityName, int startDelay, int duration) {
        this.activityName = activityName;
        this.startDelay = startDelay;
        this.duration = duration;
    }

    private void printState(Thread t, String phase) {
        System.out.println(activityName + " | " + phase +
                " | Thread: " + t.getName() +
                " | State: " + t.getState());
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        try {
            printState(t, "Initialized");

            // Delay before activity starts
            Thread.sleep(startDelay * 1000);
            printState(t, "Started");

            // Simulate activity execution
            for (int i = 1; i <= duration; i++) {
                System.out.println(activityName +
                        " in progress... (" + i + "/" + duration + ")" +
                        " | Thread: " + t.getName());
                Thread.sleep(1000);
            }

            printState(t, "Completed");

        } catch (InterruptedException e) {
            System.out.println(activityName + " interrupted.");
        }
    }
}

public class ExamHallManagement {
    public static void main(String[] args) {

        // Activities
        ExamActivity entry = new ExamActivity("Student Entry Monitoring", 0, 5);
        ExamActivity questionPaper = new ExamActivity("Question Paper Distribution", 5, 3);
        ExamActivity attendance = new ExamActivity("Attendance Marking", 10, 4);
        ExamActivity collection = new ExamActivity("Answer Sheet Collection", 15, 3);

        // Threads
        Thread t1 = new Thread(entry, "Entry-Thread");
        Thread t2 = new Thread(questionPaper, "QuestionPaper-Thread");
        Thread t3 = new Thread(attendance, "Attendance-Thread");
        Thread t4 = new Thread(collection, "Collection-Thread");

        // Set priorities
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        t3.setPriority(8);
        t4.setPriority(7);
        t1.setPriority(Thread.NORM_PRIORITY); // 5

        // Show initial states
        System.out.println("Initial Thread States:");
        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());
        System.out.println(t3.getName() + ": " + t3.getState());
        System.out.println(t4.getName() + ": " + t4.getState());

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Monitor thread lifecycle
        try {
            while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()) {
                System.out.println("\n--- Thread States ---");
                System.out.println(t1.getName() + ": " + t1.getState());
                System.out.println(t2.getName() + ": " + t2.getState());
                System.out.println(t3.getName() + ": " + t3.getState());
                System.out.println(t4.getName() + ": " + t4.getState());

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Monitoring interrupted.");
        }

        System.out.println("\nAll exam hall activities completed.");
    }
}