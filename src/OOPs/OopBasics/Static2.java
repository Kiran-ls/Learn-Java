package OOPs.OopBasics;

class StaticDemo2 {
    //static variables
    static int x = 10;
    static int y;

    //non-static variables
    int a = 100;
    int b;
}

public class Static2 {
    public static void main(String[] args) {
        //accessing static variables
        System.out.println("x = " + StaticDemo2.x);
        System.out.println("Y = " + StaticDemo2.y);

        //accessing non-static variables
        StaticDemo2 s = new StaticDemo2();
        System.out.println("A = " + s.a);
        System.out.println("B = " + s.b);
    }
}
