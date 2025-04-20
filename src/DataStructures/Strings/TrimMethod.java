package DataStructures.Strings;

import java.util.Scanner;

public class TrimMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String res = str.trim();
        System.out.println("The trimmed string is \"" + res + "\"");
        sc.close();
    }
}
