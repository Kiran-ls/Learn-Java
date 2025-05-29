package AdvanceJava.MultiThreading;

public class DaemonThread {
    public static void main(String[] args) {
        PlacementThread1 pt = new PlacementThread1();
        TrainingThread1 tt = new TrainingThread1();
        tt.setDaemon(true);
        tt.setPriority(1);
        DoubtThread1 dt = new DoubtThread1();
        dt.setDaemon(true);
        dt.setPriority(1);

        pt.start();
        tt.start();
        dt.start();
    }
}

//main activity
class PlacementThread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Placement is on...");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("problem occured!");
        }
    }
}

//supportive activity
class TrainingThread1 extends Thread {
    public void run() {
        try {
            for (;;) {
                System.out.println("Training is on...");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("problem occured!");
        }
    }
}

//supportive activity
class DoubtThread1 extends Thread {
    public void run() {
        try {
            for (;;) {
                System.out.println("Doubt solving is on...");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("problem occured!");
        }
    }
}
