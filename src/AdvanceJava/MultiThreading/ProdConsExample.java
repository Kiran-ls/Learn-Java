package AdvanceJava.MultiThreading;

//Producer - Consumer Problem
public class ProdConsExample {
    public static void main(String[] args) {
        PizzaHouse ph = new PizzaHouse();
        ChefThread chef = new ChefThread(ph);
        CustomerThread cust = new CustomerThread(ph);
        chef.start();
        cust.start();
    }
}

class ChefThread extends Thread {
    PizzaHouse ph;

    public ChefThread(PizzaHouse ph) {
        this.ph = ph;
    }
    public void run() {
        ph.bake();
    }
}

class CustomerThread extends Thread {
    PizzaHouse ph;

    public CustomerThread(PizzaHouse ph) {
        super();
        this.ph = ph;
    }
    public void run() {
        ph.eat();
    }
}

class PizzaHouse {
    int token = 1;
    public void bake() {
        System.out.println("Chef is calling bake");
    }
    public void eat() {
        System.out.println("Customer is calling eat");
    }
}
