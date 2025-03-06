package PlayWithNumbers;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int lastdig=0, sum = 0;

        while (num > 0) {
            lastdig = num % 10;
            sum = sum + lastdig;
            num = num / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
