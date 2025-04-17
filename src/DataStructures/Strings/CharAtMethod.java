package DataStructures.Strings;

import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str = sc.nextLine();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        if(index >=0 && index < str.length()) {
            System.out.println("The character at index " + index + " is " + str.charAt(index) + ".");
        } else {
            System.out.println("Invalid index.");
        }
        sc.close();
    }
}
