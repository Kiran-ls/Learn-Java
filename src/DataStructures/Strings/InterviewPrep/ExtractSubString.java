package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class ExtractSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter a ending index: ");
        int last = sc.nextInt();
        String sb = str.substring(start, last);
        System.out.println("Substring  \"" + sb + "\"");
        sc.close();
    }
}
