package DataStructures.Arrays2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = sc.nextInt();
        System.out.println("Enter Columns size: ");
        int cols = sc.nextInt();
        int[][] m = new int[row][cols];
        System.out.println("Enter elements for a 3x4 matrix:");

        // Input elements
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // Output elements
        System.out.println("Matrix elements are:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close();
    }
}
