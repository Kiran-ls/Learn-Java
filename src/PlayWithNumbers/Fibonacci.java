package PlayWithNumbers;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int terms = sc.nextInt();
        int a = 1, b = 1;

        while (terms > 0) {
            System.out.print(a+" " );
            int temp = a + b;
            a = b;
            b = temp;
            terms--;

        }
    }
}
