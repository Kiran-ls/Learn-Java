package OOPs.Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        JavaMetor ji = new JavaMetor();
        sqlMentor si = new sqlMentor();

        new AbstractClass().startSession(ji);
        new AbstractClass().startSession(si);
    }
    public void startSession(Mentor m) {
        m.trainInterns();
        m.takeAttendance();
    }
}

abstract class Mentor {
    public void trainInterns() {
        System.out.println("train interns on something...");
    }
    public void takeAttendance() {
        System.out.println("take daily attendance...");
    }
}

class JavaMetor extends Mentor {
    public void trainInterns() {
        System.out.println("train interns on java...");
    }
    public void takeAttendance() {
        System.out.println("take java class attendance...");
    }
}

class sqlMentor extends Mentor {
    public void trainInterns() {
        System.out.println("train interns on SQl...");
    }
    public void takeAttendance() {
        System.out.println("take SQL class attendance...");
    }
}