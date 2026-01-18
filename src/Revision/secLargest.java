package Revision;

public class secLargest {
    public static void main(String[] args) {
        int[] arr =  {1,2,8,10,5,10};
        // approach: find largest ele and then 2nd largest ele
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){ // max ele
            if (arr[i]>max) max = arr[i];
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println(smax);
    }
}
