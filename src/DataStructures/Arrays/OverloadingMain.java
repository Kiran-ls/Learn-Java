package DataStructures.Arrays;

public class OverloadingMain {
    public static void main(String[] args) {
        System.out.println("main with String");
        main(10);
        main();
    }
    public static void main( int a) {
        System.out.println("Main with integer arguments");
    }
    public static void main() {
        System.out.println("main with no args");
    }
}
