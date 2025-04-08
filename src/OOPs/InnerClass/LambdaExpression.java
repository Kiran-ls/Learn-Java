package OOPs.InnerClass;

public class LambdaExpression {
    public static void main(String[] args) {
        Greeting g = (name) -> {
            System.out.println("Hello: " + name);
        };
        g.greet("Kiran");

        //lambda exp for add
        Addition m = (a,b) -> {
            System.out.println("Sum = " + (a + b));
        };
        m.add(10, 20);

        //lambda exp for sub
        Subtract s = (a,b) -> {
            System.out.println("Difference = " + (a - b));
        };
        s.sub(20, 10);
    }
}

interface Greeting {
    void greet(String name);
}

interface Addition{
    void add (int a, int b);
}

interface Subtract {
    void sub (int a, int b);
}

