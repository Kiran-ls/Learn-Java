package OOPs.OopBasics;

class StudentDemo {
    String name;
    String branch;
    int yop;

    public void study() {
        System.out.println("Study java!");
    }
    public void eat() {
        System.out.println("Eat well");
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo();
        s.name = "Kiran";
        s.branch = "CS";
        s.yop = 2025;

        System.out.println("name = " + s.name);
        System.out.println("branch = " + s.branch);
        System.out.println("yop = " + s.yop);
        s.study();
        s.eat();
    }
}

