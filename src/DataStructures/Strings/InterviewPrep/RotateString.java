package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char temp = arr[arr.length-1];
        for (int i = arr.length-2; i>= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(arr);
    }
}
