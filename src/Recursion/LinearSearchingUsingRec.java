package Recursion;

public class LinearSearchingUsingRec {
    public static boolean exists(int arr[], int ele, int idx){
        if (idx == arr.length) return false; // ele not found
        if (arr[idx] == ele) return true; // ele found
        return exists(arr,ele,idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {9,1,9,9,5,3,0,1,1,8};
        int ele = 0;
        System.out.println(exists(arr,ele,0));
    }
}
