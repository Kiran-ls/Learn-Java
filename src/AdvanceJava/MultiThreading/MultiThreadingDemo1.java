package AdvanceJava.MultiThreading;

public class MultiThreadingDemo1 {
    public static void main(String[] args) throws InterruptedException {
        String tname = Thread.currentThread().getName();
        System.out.println("Current thread: " + tname);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Typing...");
            Thread.sleep(1000);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("error checking...");
            Thread.sleep(1000);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("saving...");
            Thread.sleep(1000);
        }
    }
}
