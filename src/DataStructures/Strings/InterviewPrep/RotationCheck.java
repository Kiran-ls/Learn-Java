package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class RotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("The string '" + str2 + "' is a rotation of '" + str1 + "'.");
        } else {
            System.out.println("The string '" + str2 + "' is a not rotation of '" + str1 + "'.");
        }
    }
}
