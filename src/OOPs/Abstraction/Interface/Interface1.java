package OOPs.Abstraction.Interface;

public class Interface1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        mc.add(10,20);
        mc.sub(100, 50);
        mc.mul(5, 5);
        mc.div(10, 2);
    }
}

interface Claculator {
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
}

interface Calci {
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}

class MyCalculator implements Claculator, Calci {
    public void add(int a, int b) {
        System.out.println("Addition is: " + (a + b));
    }
    public void sub(int a, int b) {
        System.out.println("Difference is: " + (a - b));
    }
    public void mul(int a, int b) {
        System.out.println("Multiplication is: " + (a * b));
    }
    public void div(int a, int b) {
        System.out.println("Division is: " + (a / b));
    }
}
