package PlayWithNumbers;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("The number " + temp + " has " + count + " digits.");
    }
}
