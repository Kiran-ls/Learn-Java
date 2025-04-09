package DataStructures.Arrays2D;

import java.util.Scanner;

public class SumOfMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        //create 2d array
        int[][] m = new int[rows][cols];
        //populate the array with user input
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        //print the array
        System.out.println("Array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        //find sum and print
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            int min = m[i][0];
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < min) {
                    min = m[i][j];
                }
            }
            sum += min;
            System.out.println("Minimum of row " + (i + 1) + ": " + min);
        }
        System.out.println("Sum of minimum elements: " + sum);
        sc.close();
    }
}
