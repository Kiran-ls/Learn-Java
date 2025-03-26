package OOPs.Polymorphism;

public class Upcasting1 {
    public static void main(String[] args) {
        Device myDevice = new Smartphone(); //Upcasting
        myDevice.powerOn();
    }
}

class Device {
    public void powerOn() {
        System.out.println("Device is powered on.");
    }
}
class Smartphone extends Device {
    public void powerOn() {
        System.out.println("Smart phone is powered on with touch screen interface.");
    }
}

//Upcasting is nothing but which allows subclasses to be treated as object of a superclass.