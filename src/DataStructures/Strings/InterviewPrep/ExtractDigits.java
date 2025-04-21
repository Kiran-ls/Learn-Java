package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and digits:");
        String str = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        System.out.println("Extracted Digits: " + digits);
        sc.close();
    }
}
