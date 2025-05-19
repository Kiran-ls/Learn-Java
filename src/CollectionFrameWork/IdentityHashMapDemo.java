package CollectionFrameWork;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        String resto1 = new String("Burger Heaven");
        String resto2 = new String("Burger Heaven");

        map.put(resto1, "Rating: 4.5");
        map.put(resto2, "Rating: 4.7");

        System.out.println("IdentityHaspMap: " + map);

    }
}
