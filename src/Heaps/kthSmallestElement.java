package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 3;
        // Min-Heap :-> T.C : O(nlogn)
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int ele : arr){
//            pq.add(ele); // sabse pehle heap me add karlo
//        }
//        for (int i=1; i<=k-1; i++){ // fir jiita smallest ele nikalna utte se pehle ele ko remove kr do
//            pq.remove();
//        }
//        System.out.println(pq.peek());

        // Max-Heap: T.C = O(nlogk) better than Min-Heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int ele : arr){
//            pq.add(ele);
//            if (pq.size()>k) pq.remove();
//        }
//        System.out.print(pq.peek());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(ele); // sabse pehle heap me add karlo
            if (pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
