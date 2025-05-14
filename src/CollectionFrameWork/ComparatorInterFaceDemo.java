package CollectionFrameWork;

import java.util.*;

public class ComparatorInterFaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n = sc.nextInt();
        // TODO: Create an ArrayList to store Person objects
        ArrayList<Person2> list = new ArrayList<>();
        // TODO: Add Person objects to the ArrayList
        System.out.println("Enter people details:");
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            Person2 p = new Person2(name, age);
            list.add(p);
        }

        Arrange arrange = new Arrange();
        // TODO: Sort the list of Person objects based on age using Collections.sort()
        Collections.sort(list, arrange);
        System.out.println("People sorted by age:");
        for (Person2 p1 : list) {
            System.out.println(p1);
        }
        sc.close();
    }
}

class Arrange implements Comparator<Person2> {

    public int compare(Person2 o1, Person2 o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else
            return 0;
    }
}

class Person2 {
    String name;
    int age;

    // TODO: Implement constructor, compareTo, and other necessary methods
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


