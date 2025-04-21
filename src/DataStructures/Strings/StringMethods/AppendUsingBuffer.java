package DataStructures.Strings.StringMethods;

import java.util.Scanner;

public class AppendUsingBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.print("Enter third string: ");
        String s3 = sc.nextLine();

        //append string using stringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append(s1).append(s2).append(s3);
        System.out.println("The concatenated string is " + sb + ".");

    }
}
