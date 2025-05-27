package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program starting normally");
        try {
            System.out.println("Enter the 1st number");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd number");
            int b = sc.nextInt();
            int res = a /b;
            System.out.println("Result= " + res);
        }
        catch (ArithmeticException ae) {
            System.out.println("Please do not enter denominator as zero");
        }
        catch (InputMismatchException ime) {
            System.out.println("Please enter only Integers");
        }
        catch (Exception e) {
            System.out.println("Some problem occured");
        }
        finally {
            System.out.println("Extremely important code");
        }
    }
}
