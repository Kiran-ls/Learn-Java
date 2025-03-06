package PlayWithNumbers;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);
        int sqrt1 = (int)sqrt;

        if(sqrt1 * sqrt1 == num) {
            System.out.println(num + " is a perfect square");
        } else {
            System.out.println(num + " is not a perfect sqaure");
        }
    }
}
