package Inheritance;

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.fun();
        Child c = new Child();
        c.fun();
        Parent ref = new Child(); //Upcasting
        ref.fun();        //In this case java will focus on type of object rather than type of reference variable
    }
}

class Parent {
    public void fun() {
        System.out.println("Parent fun");
    }
}
class Child extends Parent {
    public void fun() {
        System.out.println("Child fun");
    }
}