package DataStructures.Strings.InterviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first string: ");
        //taking user input and converting to lowercase
        String str1 = sc.nextLine().toLowerCase();
        char[] c1 = str1.toCharArray();  //converting the string to character array
        Arrays.sort(c1); //sorts the array in alphabetical order
        System.out.println("Enter a second string: ");
        String str2 = sc.nextLine().toLowerCase();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);
        //check if the strings are equal or not
        boolean res = Arrays.equals(c1, c2);
        System.out.println("Are the strings anagram? "  +res);
        sc.close();
    }
}
