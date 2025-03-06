package PlayWithNumbers;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int gcd = findGcd(num1, num2);
        System.out.println("GCD of two numbers: " + gcd);
    }

    public static int findGcd(int a, int b) {
        while (b % a != 0) {
            int rem  = b % a;
            b = a;
            a = rem;
        }
        return a;
    }
}
