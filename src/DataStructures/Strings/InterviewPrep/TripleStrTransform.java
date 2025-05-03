package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class TripleStrTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter a third string: ");
        String str3 = sc.nextLine();
        str1 = str1.replaceAll("[aeiouAEIOU]", "%");
        str2 = str2.replaceAll("(?i)[^aeiou\\W\\d_]", "#");
        str3 = str3.toUpperCase();
        System.out.println(str1+str2+str3);
        sc.close();
    }
}

/*
For the first word, replace all vowels (a, e, i, o, u) with %.

For the second word, replace all consonants (non-vowel alphabetic characters) with #.

For the third word, convert all letters to uppercase.

Finally, concatenate the three transformed words and print the result.
 */