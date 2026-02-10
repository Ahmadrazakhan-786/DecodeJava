package Sliding_Window;

public class NumberOfSubarrays {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,8};
        int k=3;
        int t=4;
        int n = arr.length;

        int i=0, j = k-1;
        int sum=0 , count=0;
        for (int a=0; a<=k-1; a++){
            sum += arr[a];
        }
        int avg = sum/k;
        if (avg>=t) count++;

        i++; j++;
        while (j<n){
            sum = sum-arr[i-1]+arr[j];
             avg = sum/k;
            if (avg>=t) count++;
            i++; j++;
        }
        System.out.println(count);
    }
}
