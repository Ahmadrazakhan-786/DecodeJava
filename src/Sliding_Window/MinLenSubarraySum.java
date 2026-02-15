package Sliding_Window;

public class MinLenSubarraySum {
    class Solution {
//        public int minSubArrayLen(int target, int[] arr) {
//            int n = arr.length;
//            int minLen = Integer.MAX_VALUE;
//            for (int i = 0; i < n; i++) {
//                int sum = 0;
//                for (int j = i; j < n; j++) {
//                    sum += arr[j];
//                    if (sum >= target) {
//                        minLen = Math.min(minLen, j - i + 1);
//                        break; // kyunki aur badhane se length hi badegi
//                    }
//                }
//            }
//            if (minLen ==  Integer.MAX_VALUE) return 0;
//            return minLen;
//        }
//    }
public int minSubArrayLen(int target, int[] arr) {
    int n = arr.length;
    int minLen = Integer.MAX_VALUE;
    int sum = 0;
    int low=0, high=0;
    while (high<arr.length){
       sum += arr[high];
       high++;
       while (sum>=target){
           int len = high-low;
           minLen = Math.min(minLen,len);

           sum -= arr[low];
           low++;
       }
   }
    if (minLen ==  Integer.MAX_VALUE) return 0;
    return minLen;
}
    }

    public static void main(String[] args) {

    }
}
