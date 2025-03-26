package OOPs.Inheritance;

//Main class
public class SingleInheritance {
    public static void main(String[] args) {
        //creating object for car class
        Car mycar = new Car();
        mycar.startEngine(); //calling methods from car class
        mycar.openTrunk();
        System.out.println("Car type: " + mycar.carType + " with " + mycar.wheels + " wheels.");
    }
}
//creating a Parent class
class Vehicle {
    int wheels = 4;
    public void startEngine() {
        System.out.println("Engine started");
    }
}
//Inheriting properties from Vehicle class
class Car extends Vehicle {
    String carType = "Sedan";
    public void openTrunk() {
        System.out.println("Trunk is opened");
    }
}