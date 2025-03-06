package ControlStructures;

import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int i = 1;
        do {
            if(i % 2 != 0) {
                System.out.println(i);
            } i++;
        } while (i <= n);
    }

}
