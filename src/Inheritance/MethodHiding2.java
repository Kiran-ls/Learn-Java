package Inheritance;

public class MethodHiding2 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();//When we are calling static methods java will look type of class rather than object of class
        p.fun(); //even though If we call a method using obj it will internally call method using class name
        Child1 c = new Child1();
        c.fun();
        Parent1 ref = new Child1();
        ref.fun();

    }
}

class Parent1 {
    public static void fun() {
        System.out.println("Parent fun");
    }
}
class Child1 extends Parent1 {
    public static void fun() {
        System.out.println("Child fun");
    }
}
