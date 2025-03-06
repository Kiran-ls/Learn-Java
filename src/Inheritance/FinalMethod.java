package Inheritance;

public class FinalMethod {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.show();
        c.move();
    }
}

class Parent2 {
    //Final method
    final void show() {
        System.out.println("This is a final method from the parent class");
    }
}

class Child2 extends Parent2 {
    //trying to override the final method will result in a compile-time error
   // void show() {
      //  System.out.println("Attempting to override final method");
   // }

    void move() {
        System.out.println("This is method in child");
    }
}
