package AdvanceJava.MultiThreading;

public class ThreadExample {
    public static void main(String[] args) {
        NumberThread nt = new NumberThread();
        AlphabetThread at = new AlphabetThread();

        nt.start();
        at.start();
    }
}
class NumberThread extends Thread {
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
class AlphabetThread extends Thread {
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

/*
* Two ways are there to create thread
* 1. using Thread class. The above code is created using Thread class
* 2. using Runnable.
* */