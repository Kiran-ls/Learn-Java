package PlayWithNumbers;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int min = num % 10;

        while (num > 0) {
            int rem = num % 10;
            if (rem < min) {
                min =rem;
            }
            num = num / 10;
        }
        System.out.println("The smallest digit is: " + min);
    }
}
