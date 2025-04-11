package DataStructures.Arrays3D;

import java.util.Scanner;

public class SumOf3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ask user for array dimensions and create the 3D array
        System.out.print("Enter the number of blocks: ");
        int block = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][][] m = new int[block][rows][cols];

        //populate the array with user input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++){
                    m[i][j][k] = sc.nextInt();
                }
            }
        }
        //print the array
        System.out.println("3D Array:");
        for (int i = 0; i < m.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < m[0].length; j++) {
                for (int k = 0; k < m[0][0].length; k++) {
                    System.out.print(m[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        //calculate sum
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                for (int k = 0; k < m[0][0].length; k++) {
                    sum += m[i][j][k];
                }
            }
            System.out.println("Sum of layer " + (i + 1) + ": " + sum);
        }
        sc.close();
    }
}
