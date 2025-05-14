package CollectionFrameWork;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class HashCodeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons:" );
        int n = sc.nextInt();
        //create hashset and add elements to it
        HashSet<Person> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            Person p = new Person(name, age);
            set.add(p);
        }
        System.out.println("Unique people in the HashSet:");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o.hashCode() == this.hashCode())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}