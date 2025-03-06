package PlayWithNumbers;

import java.util.Scanner;

public class PrimeWithRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  first number");
        int start = sc.nextInt();
        System.out.println("enter a  second number");
        int end = sc.nextInt();

        System.out.println("Prime numbers between given range are: ");
        for(int i = start; i <= end; i++) {
            int factors = 0;
            //loop runs n/2 times
            for (int j = 1; j <= (i/2); j++) {
                if (i % j == 0)
                    factors++;
            }

            if(factors == 1) {
                System.out.println(i);
            }
        }
    }
}
