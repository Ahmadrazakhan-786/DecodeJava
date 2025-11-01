package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4); // till here -> 1 2 3 4
        System.out.println(dq);
        dq.addFirst(5); // 5 1 2 3 4
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq); // 5 1 2 3
        dq.removeFirst();
        System.out.println(dq); // 1 2 3
        System.out.println(dq.getFirst()); // 1
        System.out.println(dq.getLast()); // 3
        dq.add(7); // i.e dq.add() is same as dq.addLast()
        System.out.println(dq);
        dq.remove(); // it removes the first element
        System.out.println(dq);
        dq.removeAll(dq); // removes everything
        System.out.println(dq);
    }
}
