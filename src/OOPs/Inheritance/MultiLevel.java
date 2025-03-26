package OOPs.Inheritance;

class Employee {
    String name;
    int employeeID;
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + name);
    }
}
//Inheriting properties from Employee class
class Manager extends Employee {
    int teamSize;
    public void displayManager() {
        displayDetails(); //calling method from Employee
        System.out.println("Manages team of size: " + teamSize);
    }
}
//Inheriting properties from Employee class
class SeniorManager extends Manager {
    String project;
    public void displaySenior() {
        displayManager(); //calling method from Employee
        System.out.println("Project: " + project);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        //creating object for SeniorManager class
        SeniorManager sm = new SeniorManager();
        sm.name = "Alice";
        sm.employeeID = 1001;
        sm.teamSize = 10;
        sm.project = "Project Alpha";
        sm.displaySenior();//calling method from seniormanager
    }
}
