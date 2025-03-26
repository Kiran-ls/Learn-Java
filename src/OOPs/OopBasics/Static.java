package OOPs.OopBasics;

class StaticDemo {
    //static variable
    static int x = 10;
    //static method
    public static void fun1() {
        System.out.println("static method executing");
    }
    //non-static variable
    int y = 20;
    //non-static method
    public void fun2() {
        System.out.println("non-static method executing");
    }
}

public class Static {
    public static void main(String[] args) {
        //accessing static components(Class name)
        System.out.println("X = " + StaticDemo.x);
        StaticDemo.fun1();

        //accessing non-static components(object reference)
        StaticDemo s = new StaticDemo();
        System.out.println("Y = " + s.y);
        s.fun2();
    }
}
