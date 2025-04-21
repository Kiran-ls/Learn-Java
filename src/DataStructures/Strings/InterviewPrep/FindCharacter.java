package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a position:");
        int position = sc.nextInt();

        //find the character at specific position
        System.out.println("Character at position " + position + ": " + str.charAt(position-1));
        sc.close();
    }
}
