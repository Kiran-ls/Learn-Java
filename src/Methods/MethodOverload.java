package Methods;

public class MethodOverload {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        add(10,10);
        add(10.20,5.5);
        add(50,2.5);
        add(12.00,10);
        add(10,20,30);
    }

    public static void add(int a, int b){
        System.out.println("Sum = " + (a + b));
    }
    public static void add(double a, double b){
        System.out.println("Sum = " + (a + b));
    }
    public static void add(int a, double b){
        System.out.println("Sum = " + (a + b));
    }
    public static void add(double a, int b){
        System.out.println("Sum = " + (a + b));
    }
    public static void add(int a, int b, int c){
        System.out.println("Sum = " + (a + b + c));
    }
}
