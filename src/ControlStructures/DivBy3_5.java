package ControlStructures;

import java.util.Scanner;

public class DivBy3_5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();
        divide(num1);
        divide(num2);
    }

    public static void divide(float div) {
        if(div % 3 == 0 && div % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }

}
