package Queue;
import java.util.*;

public class ReverseFirstkele {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int k = 3;
        for (int i=0; i<k; i++){
            st.push(q.remove());
        }

        while (st.size()>0){
            q.add(st.pop()); // stack ko khali karke queue me push kar kar diya
        }
        System.out.println(q); //  4 5 6 3 2 1

        Queue<Integer> p = new LinkedList<>();
        int rem = q.size() - k; // imp
        for (int i=0; i<rem; i++){
            p.add(q.remove()); // naya queue -> 4 5 6
        }
        while (p.size()>0){
            q.add(p.remove()); // 3 2 1 4 5 6
        }
        System.out.println(q);
    }
}
