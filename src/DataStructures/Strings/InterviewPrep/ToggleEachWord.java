package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class ToggleEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String res = "";
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                res += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                res += Character.toUpperCase(ch);
            } else {
                res += ch;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
