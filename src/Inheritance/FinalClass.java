package Inheritance;

public class FinalClass {
    public static void main(String[] args) {
        Finclass f = new Finclass();
        f.display();
    }
}
//Final class
final class Finclass {
    void display() {
        System.out.println("This is a method from final class");
    }
}
//Trying to extend final class will give an compile-time error
//class Subclass extends Finclass {
//    void display() {
//        System.out.println("Attempting to inherit from final class");
//    }
//}
