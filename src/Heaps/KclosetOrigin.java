package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KclosetOrigin {
    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d, int x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder()); // MAx-HEAP
        for (int i=0; i< points.length; i++){
            int x = points[i][0], y = points[i][1]; // smghana
            int d = x*x + y*y;
            pq.add(new Triplet(d,x,y));
            if (pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2]; // 2 is no. of col
        for (int i=0; i<k; i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}

