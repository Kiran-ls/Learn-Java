package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.print("Enter your Age:");
        int age = sc.nextInt()	;
        System.out.println("Age: " + age);
    }
}
