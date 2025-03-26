package OOPs.Inheritance;

public class MethodsInInheritance {
    public static void main(String[] args) {
        System.out.println("\nAccessing Developer-");
        Developer dev = new Developer();
        dev.task();
        dev.goal();
        dev.code();

        System.out.println("\nAccessing Test Engineer-");
        TestEngineer test = new TestEngineer();
        test.task();
        test.goal();
        test.test();

    }
}

class SoftwareEngineer {
    public void task() {
        System.out.println("Complete software on time!");
    }
    public void goal() {
        System.out.println("Deal with software");
    }
}

class Developer extends SoftwareEngineer {
    public void goal() {
        System.out.println("Deal with software development");
    }
    public void code() {
        System.out.println("Write code for a software");
    }
}

class TestEngineer extends SoftwareEngineer {
    public void goal() {
        System.out.println("Deal with software testing");
    }
    public void test() {
        System.out.println("test the new software");
    }
}
