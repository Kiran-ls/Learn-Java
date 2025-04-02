package OOPs.Constructors;

public class ConsChaining {
    public static void main(String[] args) {
        new Car1();
    }
}

class Car1 {
    public Car1() {
        this(10); //Car(10);
        System.out.println("0-param constructor");
    }
    public Car1(int i) {
        this(10,20); //Car(10,20);
        System.out.println("1-param constructor");
    }
    public Car1(int i, int j) {
        System.out.println("2-param constructor");
    }
}

/*
1. Constructor Chaining allows one constructor to call another within in the same class.
2. It is more organized and efficient way of initializing objects(there is no need to create multiple objects for multiple constructs).
*/

