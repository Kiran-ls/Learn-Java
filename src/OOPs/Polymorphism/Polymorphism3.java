package OOPs.Polymorphism;

public class Polymorphism3 {
    public static void main(String[] args) {
        Order myOrder = new Order();
        manageRestaurant(myOrder);
    }
    public static void manageRestaurant(Order myOrder) {
        myOrder.prepare();
        myOrder.serve();
        myOrder.bill();
    }
}

class Order {
    public void prepare() {
        System.out.println("Order is being Prepared!");
    }
    public void serve() {
        System.out.println("Order served to the customer!");
    }
    public void bill() {
        System.out.println("Bill generated for the order!");
    }
}
