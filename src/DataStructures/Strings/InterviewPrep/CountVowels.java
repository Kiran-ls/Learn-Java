package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("Number of vowels: " + vowelCount);
        sc.close();
    }
}
