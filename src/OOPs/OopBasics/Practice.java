package OOPs.OopBasics;

public class Practice {
    public static void main(String[] args) {
        Counter.increment();
        System.out.println(Counter.count);
        Counter.increment();
        System.out.println(Counter.count);
    }
}

class Counter {
    static int count = 0;
    static void increment() {
        count++;
    }
}
