package CollectionFrameWork;

import java.util.Objects;

public class HashCodeDemo2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Jockey");
        Student1 s2 = new Student1(1, "Jockey");
        Student1 s3 = new Student1(2, "Hockey");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}

class Student1 {
    int roll;
    String name;

    public Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public boolean equals(Object obj) {
      if (obj.hashCode() == this.hashCode())
          return true;
      else
          return false;
    }
}
