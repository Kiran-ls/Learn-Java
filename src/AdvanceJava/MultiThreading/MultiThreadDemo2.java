package AdvanceJava.MultiThreading;

public class MultiThreadDemo2 {
    public static void main(String[] args) {
        String tname = Thread.currentThread().getName();
        System.out.println("Thread executing main(): " + tname);

        MyThread mt = new MyThread();
        mt.setName("my-super-thread");
        mt.start();
    }
}
class MyThread extends Thread {
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println("Thread executing run(): " + tname);
    }
}
