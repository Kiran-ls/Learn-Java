package Inheritance;

public class Aggregation2 {
    public static void main(String[] args) {
        Charger c = new Charger();
        c.type = "c-type";

        Laptop l = new Laptop();
        l.brand = "Dell";
        l.price = 35000;
        l.hasCharger(c);
        l = null;
        //l.hasCharger(c);
       System.out.println("Accessing charger without laptop: " + c.type);
    }
}

class Laptop {
    String brand;
    int price;
    Charger c;

    public void hasCharger(Charger obj) {
        c = obj;
        System.out.println("Accessing charger with laptop: " + c.type);
        System.out.println("Laptop brand: " + brand);
        System.out.println(("Laptop price: " + price));
    }
}
class Charger {
    String type;
}
