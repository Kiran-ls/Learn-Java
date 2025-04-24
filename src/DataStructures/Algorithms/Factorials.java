package DataStructures.Algorithms;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

    }

    public static void fact(int num) {
        int fact = 1;
        fact = fact * num;
        fact(num++);
    }
}
