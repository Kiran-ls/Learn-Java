package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        //remove white spaces
        String res = str.replaceAll("\\s+","");
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + res);
        sc.close();
    }
}
