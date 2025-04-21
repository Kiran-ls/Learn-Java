package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

//Reverse a string without using a reverse method
public class ReverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = " ";

        //reverse string
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + rev);
        sc.close();
    }
}
