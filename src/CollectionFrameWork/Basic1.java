package CollectionFrameWork;

import java.util.ArrayList;

public class Basic1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(140.40);
        list.add(15.0f);
        list.add("Code");
        list.add(false);
        list.add('d');

        System.out.println("List: " + list);
        System.out.println("Size = " + list.size());
        System.out.println(list.set(0, 50));
    }
}
