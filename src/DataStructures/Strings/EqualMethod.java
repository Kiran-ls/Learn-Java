package DataStructures.Strings;

import java.util.Scanner;

public class EqualMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();
        System.out.println(str.equals(str2));
        sc.close();
    }
}
