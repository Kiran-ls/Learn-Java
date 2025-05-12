package CollectionFrameWork;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        pq.add(9);
        pq.add(3);
        pq.add(4);
        pq.add(6);
        pq.add(2);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
    }
}
