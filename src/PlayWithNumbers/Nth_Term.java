package PlayWithNumbers;

import java.util.Scanner;

public class Nth_Term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        int nThterm = findSeries(num);
        System.out.println("The " + num + "th term of the series is " + nThterm);
    }

    public static int findSeries(int num) {
        return (num * (num + 1)) /2;
    }
}
