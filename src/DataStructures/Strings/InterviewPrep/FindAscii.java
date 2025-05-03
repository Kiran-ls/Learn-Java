package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class FindAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        sc.close();
    }
}
