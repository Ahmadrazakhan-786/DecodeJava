package Searching;

public class sqrt {
    public static void main(String[] args) {
        int x = 14;
        int lo = 0, hi = x;
        int result = 0;
        while (lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(mid*mid == x){
                result = mid;
                break;
            } else if (mid*mid > x) {
                hi = mid-1;
            } else {
                lo = mid + 1;
                result = mid;
            }
        }
        System.out.println("Integer of square root is : " + result);
    }
}
