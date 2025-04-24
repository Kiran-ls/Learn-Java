package DataStructures.Algorithms;

import java.util.Scanner;

public class LinearSearchStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student names: ");
        String[] students = sc.nextLine().split("\\s+");
        System.out.println("Enter the Name you want to search: ");
        String targetName = sc.nextLine();
        //call the search method and print
        int res = searchStudent(students, targetName);

        if (res != -1) {
            System.out.println(targetName + " has completed Java module and is found at position " + res + ".");
        } else {
            System.out.println(targetName + " has not completed Java module yet.");
        }
        sc.close();
    }

    //search method
    public static int searchStudent(String[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(targetName)) {
                return i + 1;
            }
        }
        return -1;
    }
}
