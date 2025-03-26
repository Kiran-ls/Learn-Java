package OOPs.Polymorphism;

public class DownCasting3 {
    public static void main(String[] args) {
        accessRobo(new FighterRobo2());
        accessRobo(new TeacherRobo2());
        accessRobo(new DriverRobo2());
    }
    public static void accessRobo(Robo2 r) {
        r.charge();
        r.talk();
        //call FighterRobo child-specific methods
        if (r instanceof FighterRobo2) {
            ((FighterRobo2) r).fight();
        }
        //call Teacher Robo child-specific methods
        else if (r instanceof TeacherRobo2) {
            ((TeacherRobo2)r).teach();
        }
        //call Driver Robo child-specific methods
        else if (r instanceof DriverRobo2) {
            ((DriverRobo2)r).drive();
        } else {
            System.out.println("Invalid choice");
        }
    }
}

class Robo2 {
    public void charge() {
        System.out.println("Robo needs charging");
    }
    public void talk() {
        System.out.println("Robo is talking");
    }
}

class FighterRobo2 extends Robo2{
    public void talk() {
        System.out.println("Fighting robo is talking about wrestling");
    }
    public void fight() {
        System.out.println("Robo joined Fighting");
    }
}

class TeacherRobo2 extends Robo2 {
    public void talk() {
        System.out.println("Teacher robo is teaching");
    }
    public void teach() {
        System.out.println("Teacher robo taking class");
    }
}

class DriverRobo2 extends Robo2 {
    public void talk() {
        System.out.println("Driver robo is talking while driving");
    }
    public void drive() {
        System.out.println("Robo is driving car");
    }
}