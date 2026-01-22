package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KsortedArray { // TC -> O(nlogk)
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int ele : arr){
            pq.add(ele);
            if (pq.size()>k) {
                int x = pq.remove();
                ans.add(x);
            }
        }
        while (pq.size()>0) {
            int x = pq.remove();
            ans.add(x);
        }
        System.out.print(ans);

    }
}
