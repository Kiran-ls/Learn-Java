package OOPs.Polymorphism;

public class DownCasting1 {
    public static void main(String[] args) {
        Robo1 r = new DriverRobo1();
        r.charge();//accessing inherited method
        r.talk(); //accessing overridden method
        //r.drive(); //can not access child-specific method

        ((DriverRobo1)(r)).drive(); //DOWN-CASTING  //check next program for more accurate implementation.
    }

}

class Robo1 {
    public void charge() {
        System.out.println("Robo is charging");
    }
    public void talk() {
        System.out.println("Robo is talking");
    }
}
class DriverRobo1 extends Robo1 {
    public void talk() {
        System.out.println("Driver Robo doesn't talk while driving");
    }
    public void drive() {
        System.out.println("Driver robo is driving");
    }
}
