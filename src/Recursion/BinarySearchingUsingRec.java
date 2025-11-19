package Recursion;
import java.util.*;
public class BinarySearchingUsingRec {
    public static int Bserach(int[] arr, int target, int lo, int hi) {
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if (arr[mid]==target) return mid;
        else if (arr[mid]>target) {
            return Bserach(arr,target,lo,mid-1);
        }
        else return Bserach(arr,target,mid+1,hi);
    }
    public static void main(String[] args) {
        int arr[] = {9,1,9,9,5,3,0,1,1,8};
        Arrays.sort(arr); // bcz binary search works on sorted arrays
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int target = 0;
        System.out.println(Bserach(arr,target,0,n-1));
    }
}
