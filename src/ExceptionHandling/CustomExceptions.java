package ExceptionHandling;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) throws EligibilityException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a branch");
        String branch = sc.next();
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if (branch.equals("cse") && marks >= 80) {
            System.out.println("Congratulations! You're Eligible");
        } else {
            if (branch.equals("cse") == false)
                throw new EligibilityException("Only CSE allowed!");
            if (marks < 80)
                throw new EligibilityException("Only marks >= 80 allowed");
        }
    }
}

class EligibilityException extends Exception {
    public EligibilityException(String msg) {
        super(msg);
    }
}