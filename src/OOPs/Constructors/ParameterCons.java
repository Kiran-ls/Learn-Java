package OOPs.Constructors;

public class ParameterCons {
    public static void main(String[] args) {
        Student st = new Student(1, "KL", "CS", 8.7, 2024); //passing values through constructor
        st.giveIntro();
        System.out.println();
        Student st2 = new Student(2,"KS", "CSA", 8.5, 2025);
        st2.giveIntro();
    }
}

class Student {
    int roll;
    String name;
    String branch;
    double cgpa;
    int yop;

    //Creating constructor for Student class
    Student(int r, String n, String b, double c, int y) {
        roll = r;
        name = n;
        branch = b;
        cgpa = c;
        yop = y;
    }

    public void giveIntro() {
        System.out.println("roll: " + roll);
        System.out.println("name: " + name);
        System.out.println("branch: " + branch);
        System.out.println("cgpa: " + cgpa);
        System.out.println("YOP: " + yop);
    }
}

/*
1. Constructors are the special methods whose name is same as the class name.
2. Constructors are used to instantiate the objects(meaning giving values to objects).
3. Constructors are called at the time of object creation.
*/