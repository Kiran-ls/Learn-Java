package OOPs.InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine eng = c.new Engine();
        eng.runCar();
    }
}

class Car { //Outer class
    private String brand;
    private int price;
    public void drive() {
        System.out.println("Drive the car");
    }
    class Engine { //Inner class
        int hp;
        public void runCar() {
            hp = 750;
            brand = "maruthi";
            price = 750000;
            System.out.print("Car Info: ");
            System.out.println(brand + " " + price + " " + hp);
            drive();
        }
    }
}
