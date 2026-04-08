package WrapperClasses;
import java.util.ArrayList;

public class WrapperVsPrimitiveBenchmark {

    public static void main(String[] args) {

        final int SIZE = 1_000_000;

        int[] intArray = new int[SIZE];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            intArray[i] = i;
        }

        long sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += intArray[i];
        }

        long endTime = System.currentTimeMillis();
        System.out.println("int[] sum = " + sum + ", Time = " + (endTime - startTime) + " ms");

        ArrayList<Integer> arrayList = new ArrayList<>(SIZE);

        startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }

        sum = 0;
        for (Integer value : arrayList) {
            sum += value;
        }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> sum = " + sum + ", Time = " + (endTime - startTime) + " ms");
    }
}