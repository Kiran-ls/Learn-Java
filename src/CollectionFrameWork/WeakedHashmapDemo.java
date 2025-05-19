package CollectionFrameWork;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakedHashmapDemo {
    public static void main(String[] args) throws Exception {
        String obj1 = new String("java");
        String obj2 = new String("python");
        String obj3 = new String("go lang");

        WeakHashMap map = new WeakHashMap();
        map.put(obj1, 1);
        map.put(obj2, 2);
        map.put(obj3, 3);
        System.out.println(map);

        obj1 = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(map);
    }
}
