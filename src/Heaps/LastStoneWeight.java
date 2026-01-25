package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        // BRUTE FORCE
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int ele : stones){
//            ans.add(ele);
//        }
//        while (ans.size()>1){ // bcz atmost 1 ele hona chaiye arr list mein
//            Collections.sort(ans); // reverse karne pe 2 largest ele last me aa jaaenge
//            int y = ans.remove(ans.size()-1); // last ele fetch kar liye: last ele arr list me ans.size()-1 yhi hota hai
//            int x = ans.remove(ans.size()-1);
//            if (y!=x) ans.add(y-x);// means agr last 2 ele equal nhi  hue to unke diff ko firse arr list me add karo
//        }
//        if (ans.size()==0) return 0; // iska matlab agar at last gar ele 0 ho gya to wahi result hoga
//        else return ans.get(0); // agar nhi to sirf 1 ele bacha hoga jisko hum fetch karle using arr list

        // Using Max-Heap:
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : stones){
            pq.add(ele);
        }
        while (pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();
            if (y!=x) pq.add(y-x);
        }
        if (pq.size()==0) return 0;
        else return pq.peek();

    }
    public static void main(String[] args) {

    }
}
