package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class LengthMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string is " + str.length() + ".");
        sc.close();
    }
}
