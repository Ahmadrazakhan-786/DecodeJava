package Searching;
import java.util.*;
public class FirstandLastIdx {
    ArrayList<Integer> find(int arr[], int x) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int lo, hi;
        int firstOccurrence = -1; lo=0; hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
            else{ // means u got the desired target
                firstOccurrence = mid;
                hi = mid-1;
            }
        }

        int lastOccurrence = -1; lo=0; hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]>x) hi = mid-1;
            else if(arr[mid]<x) lo = mid+1;
            else{ // means u got the desired target
                lastOccurrence = mid;
                lo = mid+1;
            }
        }
        ans.add(firstOccurrence);
        ans.add(lastOccurrence);
        return ans;
    }
    public static void main(String[] args) {

    }
}
