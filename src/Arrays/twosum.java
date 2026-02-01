package Arrays;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,-1};
        int targetsum = 9;

//        for (int i = 0; i < arr.length; i++) {  // TC: O(n2)
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == targetsum){
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }
        int n = arr.length;
        Arrays.sort(arr); // TC: O(nlogn)
        int i=0, j=n-1;
        while (i<j){ // TC: O(n)
            if (arr[i]+arr[j]==targetsum) System.out.print(arr[i] + " " + arr[j]);
            else if (arr[i]+arr[j]<targetsum) i++;
            else j--;
        }
        // TOTAL TC: O(nlogn)
    }
}
