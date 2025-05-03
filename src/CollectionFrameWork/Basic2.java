package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Basic2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //THERE ARE 3 WAYS TO ACCESS THE ELEMENTS IN THE LIST

        //accessing arraylist individual element using for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //using enhanced for loop
        for (Object i : list) {
            System.out.println(i);
        }
        System.out.println();

        //using Iterators
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
