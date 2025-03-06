package OOPs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method() executing");
        StaticMore1.fun();
    }
}

class StaticMore1 {
    static int a = 10;
    static int b = 0;

    static {
        System.out.println("static block1 executing");
        System.out.println(a);
        System.out.println(b);
    }
    static {
        System.out.println("static block2 executing");
    }

    public static void fun() {
        System.out.println("static method() executing");
        System.out.println(a);
        System.out.println(b);
    }
}

