package PlayWithNumbers;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numner");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, lastdig = 0;

        while(num > 0) {
            lastdig = num % 10;
            rev= rev * 10 + lastdig;
            num = num / 10;
        }
        if(temp==rev) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + "not plaindrome");
        }
    }
}
