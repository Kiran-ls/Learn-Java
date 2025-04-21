package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class ImmutableString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1.concat(s2); //or s1 + s2;
        System.out.println("Original UerName: " + s1);
        System.out.println("New UserName: " + s3);
        sc.close();
    }
}
