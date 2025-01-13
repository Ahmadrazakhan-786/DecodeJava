package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,14,25,35,48,70,91,97};
        int n = arr.length;
        int target = 25;
        int low = 0 , high = n-1;
        boolean flag = false; // false means not present

        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        if (flag == true) System.out.println("Target Found");
        else System.out.println("Traget not Found");
    }
}
