package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class ConcatMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();

        System.out.println("The concatenated string is: " + str.concat(str2));
        sc.close();
    }
}
