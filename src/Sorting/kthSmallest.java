package Sorting;

public class kthSmallest {
    class Solution {
        public int findKthLargest(int[] arr, int k) { // used selection sort
            int n = arr.length;
            for(int i=0; i<k; i++){ // shuru ke k ele sort krdo
                int min = Integer.MAX_VALUE;
                int minIdx = -1;
                for(int j=i; j<n; j++){
                    if(arr[j]<min){
                        min = arr[j];
                        minIdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            return arr[k-1];
        }
    }

    public static void main(String[] args) {

    }
}
