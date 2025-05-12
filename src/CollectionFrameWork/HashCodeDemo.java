package CollectionFrameWork;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jockey");
        Student s2 = new Student(1, "Jockey");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
    }
}

class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
