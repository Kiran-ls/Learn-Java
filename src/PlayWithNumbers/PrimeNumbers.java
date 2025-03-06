package PlayWithNumbers;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int factors = 0;

        //loop runs n/2 time
        for (int i = 1; i<= (num / 2); i++) {
            if(num % i == 0)
                factors++;
        }
        if (factors == 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
