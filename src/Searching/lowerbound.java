package Searching;

public class lowerbound {
   public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,140,264};
        int n = arr.length;
        int target = 50;
        int lb = n;
        int low = 0, high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>=target){ // for ub = arr[mid]>x and same code.
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else low = mid+1;
        }
       System.out.println(lb);
    }
}
