package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        Student2 st1 = new Student2(6, "raj", 7.6);
        Student2 st2 = new Student2(2, "amit", 6.6);
        Student2 st3 = new Student2(8, "vishnu", 9.6);
        Student2 st4 = new Student2(5, "amy", 8.6);

        ArrayList<Student2> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}

class Student2 implements Comparable<Student2> {
    int roll;
    String name;
    double cgpa;


    public Student2(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
    public int compareTo(Student2 o) {
        if (this.cgpa > o.cgpa)
            return 1;
        if (this.cgpa < o.cgpa)
            return -1;
        else
            return 0;
    }
}
