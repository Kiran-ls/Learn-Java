package Inheritance;

public class Inheritance_Methods {
    public static void main(String[] args) {
        Manager1 mg = new Manager1();
        //calling the inherited method
        mg.work();
        //calling the overridden method
        mg.attendMeeting();
        //calling child specific method
        mg.conductReview();
    }
}

class Employee1 {
    void work() {
        System.out.println("Employee is working");
    }
    void attendMeeting() {
        System.out.println("Employee is attending meeting");
    }
}
class Manager1 extends Employee1 {
    //Overridden Methods
    void attendMeeting() {
        System.out.println("Manager is leading Meeting");
    }

    //Child Specific method
    void conductReview() {
        System.out.println("Manager is conducting review session");
    }
}

/*
There are 3 types of methods in inheritance--
1.Inherited Method :- defined in super class and directly available to subclass without any changes.
2.Overridden Method :- defined in super class that are redefined in subclass.
3.Child-Specific Method :-Methods that are only defined in the subclass.
*/