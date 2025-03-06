package ControlStructures;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        sc.nextLine();                              /*it will allow to enter next
													input by accepting the remaining enter
													input by previously taken input */
        System.out.println("Enter ur choice:");
        char operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("RESULT:" + (num1 + num2));
                break;
            case '-':
                System.out.println("RESULT: " + (num1 - num2));
                break;
            case '*':
                System.out.println("RESULT: " + (num1 * num2));
                break;
            case '/':
                System.out.println("RESULT: " + (num2 / num1));
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
