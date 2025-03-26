package OOPs.Inheritance;

class User {
    String name;
    int userID;
    public void displayUserDetails()  {
        System.out.println("User ID: " + userID + ", Name: " + name);
    }
}

class Student extends User {
    String grade;
    public void displayStudentDetails() {
        displayUserDetails(); //calling method from USer
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends User {
    String subject;
    public void displayTeacherDetails() {
        displayUserDetails(); //calling method from User
        System.out.println("Subject: " + subject);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        //creating object for student class
        Student st = new Student();
        st.name = "John";
        st.userID = 101;
        st.grade = "A";
        st.displayStudentDetails(); //calling method form student

        //creating object for teacher class
        Teacher t = new Teacher();
        t.name = "Mr. Smith";
        t.userID = 201;
        t.subject = "Maths";
        t.displayTeacherDetails(); //calling method from teacher
    }

}
