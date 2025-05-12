package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {
        Apple1 a1 = new Apple1("red", 100);
        Apple1 a2 = new Apple1("green", 200);
        Apple1 a3 = new Apple1("mix", 150);

        ArrayList<Apple1> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);

        display(appleList);

        Potato p1 = new Potato("red", 200);
        Potato p2 = new Potato("green", 150);
        Potato p3 = new Potato("mix", 100);

        ArrayList<Potato> potatoList = new ArrayList<>();
        potatoList.add(p1);
        potatoList.add(p2);
        potatoList.add(p3);

       // display(potatoList);
    }

    public static void display(List<? extends Fruit> fruitList) {
        System.out.println("Fruit list: " + fruitList);
        System.out.println("Number of fruits: " + fruitList.size());
    }
}

class Fruit {
    // Common base class
}

class Apple1 extends Fruit {
    String color;
    int price;

    public Apple1(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple1{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class Potato {
    String color;
    int price;

    public Potato(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
