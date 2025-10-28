package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args){
//        Queue<Integer> q = new ArrayDeque<>(); // we can initialize queue with this way
        Queue<Integer> q = new LinkedList<>(); // or this way
        System.out.println(q.isEmpty()); // true
        q.add(1);
        System.out.println(q.isEmpty()); // false
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size()); // 5
        System.out.println(q); // 1,2,3,4,5
        q.remove();
        System.out.println(q); // 2,3,4,5 -> FIFO
        q.poll(); // poll do the same operation as remove
        System.out.println(q); // 3,4,5 -> FIFO
        System.out.println(q.peek()); // 3
        System.out.println(q.element()); // 3 : element and peek both do the same operations
    }
}
