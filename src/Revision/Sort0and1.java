package Revision;

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1}; // two pass soln:
        int n = arr.length;
//        int noOfZeros = 0;
//        int noOfOnes = 0;
//        // calc no of zeros and ones:
//        for (int ele : arr){
//            if (ele==0) noOfZeros++;
//            else noOfOnes++;
//        }
//        // now putting the values in their resp order
//        for (int i=0; i<noOfZeros; i++){ // putting noOfZeros first
//            arr[i] = 0;
//        }
//
//        for (int i=noOfZeros; i<n; i++){ // putting noOfOnes
//            arr[i] = 1;
//        }
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }

        // M-2: using 1 pass soln
        int i=0, j= n-1;
       while (i<j){
           if (arr[i]==0) i++;
           else if (arr[j]==1) j--;
           else if(arr[i]==1 && arr[j]==0){
               arr[i] = 0;
               arr[j] = 1;
               i++;
               j--;
           }
       }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
