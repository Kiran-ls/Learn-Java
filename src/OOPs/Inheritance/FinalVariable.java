package OOPs.Inheritance;

public class FinalVariable {
    public static void main(String[] args) {
        FinalVarDemo f =new FinalVarDemo();
        f.displaySpeed();
    }
}

class FinalVarDemo {
    //final variable
    final int max_speed = 120;

    public void displaySpeed() {
        //trying to change the value of final variable will result in a compile time error
        //max_speed = 150
        System.out.println("Maximum speed is: " + max_speed);
    }
}