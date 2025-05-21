package CollectionFrameWork;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionDemo {
    public static void main(String[] args) {
        //fail-safe
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (Object o : list) {
            System.out.println(o);

            list.add(90);
        }
        System.out.println(list);
    }
}
