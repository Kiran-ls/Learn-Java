package ExceptionHandling;

public class ExptnObjPropogation {
    public static void main(String[] args) {
        System.out.println("main started");
        alpha();
        System.out.println("main ended");
    }

    public static void alpha() {
        System.out.println("alpha started");
        try {
            beta();
        }
        catch (Exception e) {
            System.out.println("Please provide a positive number");
        }
        System.out.println("alpha ended");
    }

    public static void beta() {
        System.out.println("beta started");
        int[] a = new int[-5];
        System.out.println("beta ended");
    }
}
