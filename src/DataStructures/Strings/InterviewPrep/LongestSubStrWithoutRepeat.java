package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class LongestSubStrWithoutRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String current = "";
        int maxLength = 0;
        for (char ch : str.toCharArray()) {
            int index = current.indexOf(ch);
            if (index != -1) {
                current = current.substring(index + 1);
            }
            current += ch;
            maxLength = Math.max(maxLength, current.length());
        }
        System.out.println("The longest substring without repeating characters is: " + maxLength);
        sc.close();
    }
}
