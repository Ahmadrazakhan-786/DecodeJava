package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1};
        int n = arr.length;
        // method-1:
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        Arrays.sort(arr);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        // method-2:
        System.out.println();
//       int numofzeros = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0) numofzeros++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i<numofzeros) arr[i] = 0;
//            else arr[i] = 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
//            if (i>j) break;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
          for (int ele: arr){
              System.out.print(ele+ " ");
          }
            System.out.println();
        }
    }
}

