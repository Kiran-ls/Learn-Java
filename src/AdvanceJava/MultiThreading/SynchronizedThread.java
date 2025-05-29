package AdvanceJava.MultiThreading;

public class SynchronizedThread {
    public static void main(String[] args) {
        BatmanThread rt1 = new BatmanThread();
        SupermanThread rt2 = new SupermanThread();
        rt1.start();
        rt2.start();
    }
}

class BatmanThread extends Thread {
    Library lb = new Library();
    public void run() {
        try {
            lb.batmanReads();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class SupermanThread extends Thread {
    Library lb = new Library();
    public void run() {
        try {
            lb.supermanReads();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Library {
    String book1 = "Java";
    String book2 = "Python";
    String book3 = "React";

    public void batmanReads() throws InterruptedException {
        synchronized (book1) {
            System.out.println("Reader has occupied " + book1);
            Thread.sleep(1000);
            synchronized (book2) {
                System.out.println("Reader has occupied " + book2);
                Thread.sleep(1000);
                synchronized (book3) {
                    System.out.println("Reader has occupied " + book3);
                    Thread.sleep(1000);
                }
                System.out.println("Reader has released " + book3);
            }
            System.out.println("Reader has released " + book2);
        }
        System.out.println("Reader has released " + book1);
    }
    public void supermanReads() throws InterruptedException {
        synchronized (book1) {
            System.out.println("Reader has occupied " + book1);
            Thread.sleep(1000);
            synchronized (book2) {
                System.out.println("Reader has occupied " + book2);
                Thread.sleep(1000);
                synchronized (book3) {
                    System.out.println("Reader has occupied " + book3);
                    Thread.sleep(1000);
                }
                System.out.println("Reader has released " + book3);
            }
            System.out.println("Reader has released " + book2);
        }
        System.out.println("Reader has released " + book1);
    }
}
