package DataStructures.Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter names of the students: ");
        String[] s = new String[size];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }

        System.out.println("Names are: ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
