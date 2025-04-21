package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first string:");
        String str1 = sc.nextLine();
        System.out.println("enter a second string:");
        String str2 = sc.nextLine();

        if (str1.contains(str2)) {
            System.out.println("The substring '" + str2 + "' present in the main string");
        } else {
            System.out.println("The substring '" + str2 + "' is not present in the main string");
        }
    }
}
