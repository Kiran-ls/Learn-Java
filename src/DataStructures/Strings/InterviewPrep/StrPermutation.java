package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class StrPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        getPermuation(str, "");
        sc.close();
    }

    public static void getPermuation(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            getPermuation(remaining, res + ch);
        }
    }
}
