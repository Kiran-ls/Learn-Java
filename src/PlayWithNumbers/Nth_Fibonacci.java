package PlayWithNumbers;

import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int a = 0, b = 1, fib =0;
        int terms = 2;
        while (terms <= n) {
            fib = a + b;
            a = b;
            b = fib;
            terms++;
        }
        System.out.println("The " + n + "th Fibonacci number is " + fib);
    }
}
