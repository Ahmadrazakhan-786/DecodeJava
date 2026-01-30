package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromDataStream {
    class MedianFinder { // Best Approach
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        public MedianFinder() { // constructor

        }

        public void addNum(int num) { // for addition and removal T.C is logn for one call but for n calls T.C will be :O(nlogn)
            // sbse pehle kisi v ek heap me add krdo:
            if (maxHeap.size()==0) maxHeap.add(num);
            else {
                if (num<maxHeap.peek()) maxHeap.add(num);
                else minHeap.add(num);
            }

            // Balance the heaps : Means dono heaps ke size me 1 se jaade ka difference nhi hona chaiye
            if (maxHeap.size()>minHeap.size()+1){
                int top = maxHeap.remove();
                minHeap.add(top);
            }
            if (minHeap.size()>maxHeap.size()+1){
                int top = minHeap.remove();
                maxHeap.add(top);
            }
        }

        public double findMedian() { // T.C for one call O(1) for n calls T.C will be O(n)
            if (maxHeap.size()==minHeap.size()) return (maxHeap.peek()+minHeap.peek())/2.0;
            else if (maxHeap.size()>minHeap.size()) return maxHeap.peek();
            else return minHeap.peek();
        }
    } // Total T.C : O(nlogn) + O(n) = O(nlogn)
    public static void main(String[] args) {

    }
//    class MedianFinder { // Brute Force
//        ArrayList<Integer> arr = new ArrayList<>();
//        public MedianFinder() { // constructor
//
//        }
//
//        public void addNum(int num) {
//            arr.add(num);
//        }
//
//        public double findMedian() {
//            Collections.sort(arr);
//            int n = arr.size();
//            if (n%2!=0) return arr.get(n/2);
//            else return (arr.get(n/2) + arr.get(n/2-1))/2.0;
//        }
//    }

//    class MedianFinder { // Improved Approach
//        ArrayList<Integer> arr = new ArrayList<>();
//        public MedianFinder() { // constructor
//
//        }
//
//        public void addNum(int num) {
//            arr.add(num);
//            int i = arr.size()-1;
//            while(i>0){
//                if(arr.get(i)<arr.get(i-1)){
//                    swap(i,i-1);
//                    i--;
//                }
//                else break;
//            }
//        }
//
//        public void swap(int i, int j){
//            int temp = arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,temp);
//        }
//
//        public double findMedian() {
//            int n = arr.size();
//            if (n%2!=0) return arr.get(n/2);
//            else return (arr.get(n/2) + arr.get(n/2-1))/2.0;
//        }
//    }
}
