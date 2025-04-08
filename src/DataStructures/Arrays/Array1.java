package DataStructures.Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();

        //array creation
        int[] m = new int[size];
        //populating array
        System.out.println("Enter Marks: ");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        //displaying array elements
        System.out.println("Marks: ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}
