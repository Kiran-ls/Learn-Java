package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("The string '" + str + "' is palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }
        sc.close();
    }
}
