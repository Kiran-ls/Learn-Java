package AdvanceJava.MultiThreading;

//using Runnable() interface
public class ThreadExample2 {
    public static void main(String[] args) {
        NumberPrinting numbers = new NumberPrinting();
        AlphabetPrinting alphabets = new AlphabetPrinting();

        Thread t1 = new Thread(numbers);
        Thread t2 = new Thread(alphabets);
        t1.start();
        t2.start();
    }
}

class NumberPrinting implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Some exception...");
        }
    }
}

class AlphabetPrinting implements Runnable {
    public void run() {
        try {
            for (char i = 'a'; i <= 'e'; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Some exception...");
        }
    }
}
