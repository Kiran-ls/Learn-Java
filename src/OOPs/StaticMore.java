package OOPs;

public class StaticMore {
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

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Main method() executing");
        StaticMore.fun();
    }
}

