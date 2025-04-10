package DataStructures.Arrays2D;

public class Jagged_2D {
    public static void main(String[] args) {
        int[][] m = new int[3][];
        m[0] = new int[2];
        m[1] = new int[4];
        m[2] = new int[3];

        //inserting values into array
        //1st row
        m[0][0] = 51;
        m[0][1] = 52;
        //2nd row
        m[1][0] = 61;
        m[1][1] = 62;
        m[1][2] = 63;
        m[1][3] = 64;
        //3rd row
        m[2][0] = 71;
        m[2][1] = 72;
        m[2][2] = 73;

        //printing array
        System.out.println("Array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
