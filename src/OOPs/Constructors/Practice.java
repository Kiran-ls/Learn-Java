package OOPs.Constructors;

public class Practice {
    public static void main(String[] args) {
        new Child();
    }
}

class Parent {
    Parent() {
        System.out.println("0-param parent const");
    }
    Parent(int a) {
        this();
        System.out.println("1-param parent cons");
    }
}

class Child extends Parent {
    Child() {
        this(10);
        System.out.println("0-param child cons");
    }
    Child(int i) {
        super(10);
        System.out.println("1-param child cons");
    }
}
