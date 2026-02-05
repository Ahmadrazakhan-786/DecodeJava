package Searching;

public class FirstOcuurence {
    class Solution {
        public int binarysearch(int[] arr, int k) {
            int n = arr.length;
            int lo = 0 , hi = n-1;
            int idx = -1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(arr[mid]>k) hi = mid-1;
                else if (arr[mid]<k) lo = mid+1;
                else{
                    idx = mid;
                    hi = mid-1 ; // going left bcz first occurence udhar hi milegi
                }
            }
            return idx;
        }
    }
    public static void main(String[] args) {

    }
}
