package OOPs.InnerClass;

public class LocalClass {
    public static void main(String[] args) {
        Fresher f = new Fresher();
        f.travel();
    }
}

class Fresher {
    public void travel() {
        class Car { //Local class
            String brand = "wagon r";
            public void drive() {
                System.out.println("Drive to the destination by " + brand);
            }
        }
        Car c = new Car();
        c.drive();
    }
}
