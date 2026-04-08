package using_inheritance;
interface PrintStrategy {
    void print();
}

class NormalPrint implements PrintStrategy {
    public void print() {
        System.out.println("Normal printing");
    }
}

class ColorPrint implements PrintStrategy {
    public void print() {
        System.out.println("Color printing");
    }
}

class Printer {
    private PrintStrategy strategy;

    Printer(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    void print() {
        strategy.print();
    }
}
public class UsingDelegation {
    public static void main(String[] args) {
        Printer p1 = new Printer(new NormalPrint());
        Printer p2 = new Printer(new ColorPrint());

        p1.print();
        p2.print();
    }
}
