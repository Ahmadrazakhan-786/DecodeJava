package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicImplemenation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> p = new LinkedList<>();
        while (q.size()>0){
            System.out.print(q.peek() + " ");
            p.add(q.remove());
        }
        while(p.size()>0){
            q.add(p.remove());
        }
    }
}
