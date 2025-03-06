package PlayWithNumbers;

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int res = sumOfDigits(num);
        while (res >= 10) {
            res = sumOfDigits(res);
            System.out.println(res);
        }
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int dig = num % 10;
            sum += dig;
            num = num / 10;
        }
        return sum;
    }
}

