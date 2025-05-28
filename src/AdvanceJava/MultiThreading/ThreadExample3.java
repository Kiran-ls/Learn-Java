package AdvanceJava.MultiThreading;

public class ThreadExample3 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Enrolled at Kodnest");
        //training and placement
        TrainingThread tt = new TrainingThread();
        PlacementThread pt = new PlacementThread();
        tt.start();
        pt.start();

        tt.join();
        pt.join();

        System.out.println("Tata Kodnest");
    }
}

class TrainingThread extends Thread {
    public void run() {
        try {
            System.out.println("Training has started");
            Thread.sleep(1000);
            System.out.println("Training is on");
            Thread.sleep(1000);
            System.out.println("Training has ended");
        } catch (Exception e) {
            System.out.println("Some problem...");
        }
    }
}

class PlacementThread extends Thread {
    public void run() {
        try {
            System.out.println("Placement has started");
            Thread.sleep(1000);
            System.out.println("Placement is on");
            Thread.sleep(1000);
            System.out.println("Placement has ended");
        } catch (Exception e) {
            System.out.println("Some problem...");
        }
    }
}
