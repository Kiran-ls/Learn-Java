package ControlStructures;

import java.util.Scanner;

public class FindMe {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String name = sc.nextLine();
        System.out.println("Enter a index number: ");
        int index = sc.nextInt();
        System.out.println(name.charAt(index));
    }
}
