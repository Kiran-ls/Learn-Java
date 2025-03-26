package OOPs.Polymorphism;

public class Polymorphism2 {
    public static void main(String[] args) {
        System.out.println("Accessing Teacher Robo:");
        TeacherRobo tr = new TeacherRobo();
        AccessRobo(tr); //calling TeacherRobo methods through AccessRobo method
        System.out.println("\nAccessing Fighter Robo:");
        FighterRobo fr = new FighterRobo();
        AccessRobo(fr); //calling FighterRobo methods through AccessRobo method
        System.out.println("\nAccessing Driver Robo:");
        DriverRobo dr = new DriverRobo();
        AccessRobo(dr); //calling DriverRobo methods through AccessRobo method

    }
    public static void AccessRobo(Robo r) {  //We are creating method that accepts parent class object as parameters
        r.charge();
        r.talk();
        r.move();
    }
}

class Robo {
    void charge() {
        System.out.println("Robo is charging");
    }
    void talk() {
        System.out.println("Robo is talking");
    }
    void move() {
        System.out.println("Robo is moving");
    }
}

class TeacherRobo extends Robo {
//all the methods from parent class will be inherited
}
class FighterRobo extends Robo {
//all the methods from parent class will be inherited
}
class DriverRobo extends Robo {
//all the methods from parent class will be inherited
}