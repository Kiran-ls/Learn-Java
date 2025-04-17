package DataStructures.Strings;

import java.util.Scanner;

public class IndexOfMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str = sc.nextLine();
        System.out.println("Enter character to find index: ");
        String index = sc.nextLine();

        int res = str.indexOf(index);
        if (res == -1) {
            System.out.println("Character not found");
        } else {
            System.out.println("The index of the first occurrence is " + res + ".");
        }

    }
}
