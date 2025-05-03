package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        try {
            Pattern.compile(str);
            System.out.println("The pattern '" + str + "' is valid.");
        } catch (PatternSyntaxException e) {
            System.out.println("The pattern '" + str + "' is not valid.");
        }
        sc.close();
    }
}
