package using_inheritance;
class Person {
    private int age;   // private field

    public void setAge(int age) {   // setter
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {   // getter
        return age;
    }
}

class Student extends Person {
    void display() {
        System.out.println("Student age: " + getAge());
    }
}
public class privateField {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(20);   // setting value using setter
        s.display();
    }
}
