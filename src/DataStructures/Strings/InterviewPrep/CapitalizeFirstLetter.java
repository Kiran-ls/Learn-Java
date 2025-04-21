package DataStructures.Strings.InterviewPrep;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String res = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalized = word.substring(0,1).toUpperCase() + word.substring(1);
                res += capitalized + " ";
            }
        }
        System.out.println("Capitalized String: " + res);
        sc.close();
    }
}

//we can also solve this by creating a stringBuilder()
//after splitting string add this code

//StringBuilder res = new StringBuilder();
//for (String word : words) {
//    if (!word.isEmpty()) {
//        res.append(Character.toUpperCase(word.charAt(0)))
//        .append(word.substring(1))
//        .append(" ");
//        }
//        }
//System.out.println("Capitalized string: " + res.toString().trim());
