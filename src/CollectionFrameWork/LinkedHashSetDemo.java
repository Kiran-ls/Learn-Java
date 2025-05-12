package CollectionFrameWork;
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(22);
        set.add("Kiran");
        set.add(true);
        set.add(3.75);
        set.add(33);
        System.out.println(set);
    }
}
