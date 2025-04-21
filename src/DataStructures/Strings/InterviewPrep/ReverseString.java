package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("The reversed String is '" + sb.reverse() + "'.");
    }
}
