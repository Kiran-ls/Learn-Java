package DataStructures.Arrays3D;

import java.util.Scanner;

public class Array3DCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter blocks: ");
        int block = sc.nextInt();
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][][] m = new int[block][rows][cols];


//        //creation of array
//        int[][][] m = new int[2][2][3];

//        //This is hardcoding
//        //1st block
//        m[0][0][0] = 41;
//        m[0][0][1] = 42;
//        m[0][0][2] = 43;
//        m[0][1][0] = 51;
//        m[0][1][1] = 52;
//        m[0][1][2] = 53;
//
//        //2nd block
//        m[1][0][0] = 61;
//        m[1][0][1] = 62;
//        m[1][0][2] = 63;
//        m[1][1][0] = 71;
//        m[1][1][1] = 72;
//        m[1][1][2] = 73;

        //This is user input
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    m[i][j][k] = sc.nextInt();
                }
            }
        }

        //printing array
        System.out.println("Array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    System.out.print(m[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
