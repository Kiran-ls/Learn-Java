package OOPs.Abstraction.Interface;

public class BankTrans {
    public static void main(String[] args) {
        RBI bank = new SBI();
        bank.giveLoans(); //abstract method
        bank.demonetise(); //default method
        RBI.rupeeToPaisa(5000); //static method
    }
}

interface RBI {
    //Abstract Method
    public abstract void giveLoans();

    //Static Method
    public static void rupeeToPaisa(int r) {
        System.out.println("Paisa = " + (r * 100));
    }

    //Private Method
    private void printNote() {
        System.out.println("Print new Notes");
    }

    //Default Method
    default void demonetise() {
        System.out.println("Old 1000 notes are not valid");
        printNote();
    }
}

class SBI implements RBI {
    public void giveLoans() {
        System.out.println("Give loans at 7.5% interest");
    }
}
