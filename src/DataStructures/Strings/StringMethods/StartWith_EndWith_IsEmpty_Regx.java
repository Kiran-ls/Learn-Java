package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class StartWith_EndWith_IsEmpty_Regx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // TODO: Check if the string starts with "Hello"
        System.out.println("Does the string start with \"Hello\"?" + " " + str.startsWith("Hello"));
        // TODO: Check if the string ends with "World!"
        System.out.println("Does the string end with \"World!\"?" + " " + str.endsWith("World!"));
        // TODO: Check if the string is empty
        System.out.println("Is the string empty? " + str.isEmpty());
        // TODO: Check if the string contains only letters using regex
        String regx = "[a-zA-Z]+";
        System.out.println("Does the string contain only letters? " + str.matches(regx));
        sc.close();
    }
}
