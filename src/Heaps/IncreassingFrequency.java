package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class IncreassingFrequency {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            if (this.freq == p.freq) return p.ele - this.ele; // if same frequency is there then return on the basis of decreasing order
            return this.freq - p.freq;
        }
    }
    public int[] frequencySort(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : arr){
            if (map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }else map.put(ele,1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()){
            int val = map.get(ele);
            pq.add(new Pair(ele,val));
        }
        int n = arr.length;
        int[] ans = new int[n];
        int idx = 0;
        while (pq.size()>0){
            Pair p = pq.remove();
            for (int i=0; i<p.freq; i++){
                ans[idx++] = p.ele;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {

    }
}
