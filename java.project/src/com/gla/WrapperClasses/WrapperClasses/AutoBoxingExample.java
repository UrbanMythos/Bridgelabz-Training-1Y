package WrapperClasses;

import java.util.ArrayList;

public class AutoBoxingExample {
    static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(15);
        number.add(5);
        number.add(20);
        number.add(10);
        number.add(5);

        int sum = 0;

        for(int i=0;i<number.size();i++){
            sum = sum+number.get(i);
        }
        System.out.println("Sum of the number = "+sum);
    }
}
