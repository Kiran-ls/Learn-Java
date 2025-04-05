package OOPs.InnerClass;

public class AnonymousClass {
    public static void main(String[] args) {
        Greeter g = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Good Morning!");
            }
        };
        g.greet();
    }
}

abstract class Greeter {
    public abstract void greet();
}
/*we can also do it for interface
interface Greeter {
public void greet();
}
*/