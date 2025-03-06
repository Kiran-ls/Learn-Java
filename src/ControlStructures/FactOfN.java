package ControlStructures;

import java.util.Scanner;

public class FactOfN {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int fact = 1;
        int i = n;
        if (n == 0) { // if n value is 0 assign 1 to it otherwise continue with do while
            fact = 1;
        } else {
            do {
                fact = fact * i;
                i--;
            } while (i >= 1);
        }
        System.out.println(fact);

    }
}
