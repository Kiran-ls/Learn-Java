package OOPs.Constructors;

public class CopyCons {
    public static void main(String[] args) {
        Candidate c1 = new Candidate("sumit", "cse", 2024, 7.5, "Reva");
        c1.display();
        Candidate c2 = new Candidate("amit", "cse", 2024, 7.8, "Reva");
        c2.display();
        Candidate c3 = new Candidate("dikshit", "cse", 2024, 7.9, "Reva");
        c3.display();
    }
}

class Candidate {
    String name;
    String branch;
    int yop;
    double cgpa;
    String institute;

    public Candidate(String name, String branch, int yop, double cgpa, String institute) {
        this.name = name;
        this.branch = branch;
        this.yop = yop;
        this.cgpa = cgpa;
        this.institute = institute;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("YOP: " + yop);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Institute: " + institute);
    }
}