package OOPs.Abstraction;

public class Abs {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

 abstract class Herbivore extends Animal {
    public void eat() {
        System.out.println("Herbivore eat veg");
    }
}

class cow extends Herbivore {
    public void eat() {
        System.out.println("cows eat daily");
    }
    public void sleep() {
        System.out.println("cows sleep at night");
    }
}

class Deer extends Herbivore {
    public void eat() {
        System.out.println("deers eat veg");
    }
    public void sleep() {
        System.out.println("deer sleep at night");
    }
}