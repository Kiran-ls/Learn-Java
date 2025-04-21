package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class OccurrenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ask for user input string and character
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);
        int count = 0;

        //count the occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("Character: " + ch);
        System.out.println("Occurrences: " + count);
    }
}
