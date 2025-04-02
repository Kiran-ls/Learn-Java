package OOPs.Constructors;

public class Shadowing1 {
    public static void main(String[] args) {
        Student1 st = new Student1(1, "KL", "CS", 8.7, 2024); //passing values through constructor
        st.giveIntro();
    }
}

class Student1 {
    int roll;
    String name;
    String branch;
    double cgpa;
    int yop;

    //Creating constructor for Student class


    public Student1(int roll, String name, String branch, double cgpa, int yop) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.yop = yop;
    }

    public void giveIntro() {
        System.out.println("roll: " + roll);
        System.out.println("name: " + name);
        System.out.println("branch: " + branch);
        System.out.println("cgpa: " + cgpa);
        System.out.println("YOP: " + yop);
    }
}