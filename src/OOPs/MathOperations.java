package OOPs;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation you need");
        String op = sc.next();
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        switch(op) {
            case "Addition": mathOperations1.Add(a, b);
                break;
            case "Subtraction": mathOperations1.Sub(a, b);
                break;
            case "Multiplication": mathOperations1.Mul(a, b);
                break;
            case "Division": mathOperations1.Div(a, b);
                break;
        }
    }
}
class mathOperations1 {
    public static void Add(int a, int b) {
        System.out.println("the result of addition is: " + (a + b));
    }
    public static void Sub(int a, int b) {
        System.out.println("the result of subtraction is: " + (a - b));
    }
    public static void Mul(int a, int b) {
        System.out.println("the result of multiplication is: " + (a * b));
    }
    public static void Div(int a, int b) {
        System.out.println("the result of division is: " + (a / b));
    }
}

