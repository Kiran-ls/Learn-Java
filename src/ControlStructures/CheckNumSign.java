package ControlStructures;

import java.util.Scanner;

public class CheckNumSign {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number ");
        int num3 = sc.nextInt();
        checkNumber(num1);
        checkNumber(num2);
        checkNumber(num3);
    }

    public static void checkNumber(int num) {
        if(num > 0) {
            System.out.println("Positive");
        } else if(num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
}
