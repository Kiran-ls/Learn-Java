package DataStructures.Strings;

import java.util.Scanner;

public class SplitAndJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to split:");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.print("Enter a delimeter: ");
        String delimeter = sc.nextLine();
        String sentence = String.join(delimeter, words);
        System.out.println("Joined sentence: " + sentence);
        sc.close();
    }
}
