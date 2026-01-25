package Heaps;

import java.util.PriorityQueue;

public class MinimumCostRopes {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(ele);
        }
        int cost = 0;
        while (pq.size()>1){ // at last end 1 rope to bachega
            int x = pq.remove();
            int y = pq.remove();
            cost += (x+y);
            pq.add(x+y);
        }
        System.out.print(cost);
    }
}
