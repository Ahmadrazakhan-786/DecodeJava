package Heaps;

import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeinKsortedLists {
    public class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele,int row,int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] range = {0,Integer.MAX_VALUE}; // Qki isse bada range ho hi nhi skti
        PriorityQueue<Triplet> pq = new PriorityQueue<>(); // Min-Heap
        int k = nums.size(); // no. of rows
        int max = Integer.MIN_VALUE;
        for (int i=0; i<k; i++){
            // sbse apne heap ki pehle col insert karo i.e 0th col
            int ele = nums.get(i).get(0); // ith row ka 0th ele fetch kar liya
            pq.add(new Triplet(ele,i,0));
            max = Math.max(max,ele);
        }
        while (true){
            Triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            // Updating the minimum range
            if (max-ele < range[1]-range[0]){
                range[0] = ele;
                range[1] = max;
            }
            if (col==nums.get(row).size()-1) break;
            int next = nums.get(row).get(col+1); // next ele ko pq me daala
            max = Math.max(max,next);
            pq.add(new Triplet(next,row,col+1));
        }
        return range;
    }
    public static void main(String[] args) {

    }
}
