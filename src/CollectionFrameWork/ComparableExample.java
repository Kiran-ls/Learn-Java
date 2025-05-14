package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n = sc.nextInt();
        // TODO: Create an ArrayList to store Person objects
        ArrayList<Person1> list = new ArrayList<>();
        // TODO: Add Person objects to the ArrayList
        System.out.println("Enter people details:");
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            Person1 p = new Person1(name, age);
            list.add(p);
        }
        // TODO: Sort the list of Person objects based on age using Collections.sort()
        Collections.sort(list);
        System.out.println("People sorted by age:");
        for (Person1 p1 : list) {
            System.out.println(p1);
        }
        sc.close();
    }
}

class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    // TODO: Implement constructor, compareTo, and other necessary methods
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person1 o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        else
            return 0;
    }
}
