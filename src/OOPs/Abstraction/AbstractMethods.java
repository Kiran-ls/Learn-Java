package OOPs.Abstraction;

public class AbstractMethods {
    public static void main(String[] args) {
        YogaTrainer yt = new YogaTrainer();
        WeightTrainer wt = new WeightTrainer();
        startWorkout(yt);
        startWorkout(wt);
    }
    public static void startWorkout(FintnessTrainer f) {
        f.conductSession();
        f.giveadvice();
    }
}

abstract class FintnessTrainer {
    public abstract void conductSession();
    public abstract void giveadvice();
}

class YogaTrainer extends FintnessTrainer {
    public void conductSession() {
        System.out.println("Conduct a yoga session...");
    }
    @Override
    public void giveadvice() {
        System.out.println("Give advice on flexibility and stress relief...");
    }
}

class WeightTrainer extends FintnessTrainer {
    public void conductSession() {
        System.out.println("Conduct a weight gain session...");
    }
    @Override
    public void giveadvice() {
        System.out.println("Give advice on muscle building...");
    }
}