package Advance_Sorting;

public class Inversion_Count {
    static int count;
    public static void print(int[] arr){
        for (int  ele:  arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    public static void inversion(int[] a, int[] b){
//        int i=0, j=0;
//        while (i<a.length && j<b.length){
//            if (a[i] > b[j]){
//                count += (a.length-i);
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else { // a[i] > b[j]
                count += (a.length-i);
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i==a.length){
            while (j<b.length) c[k++] = b[j++];
        }
        if (j==b.length){
            while (i<a.length) c[k++] = a[i++];
        }
    }
    public static void  mergesort(int[] arr){
        int n = arr.length;
        if (n==1) return; // base case
        // creating two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy paste from given array
        for (int i=0; i<n/2; i++){
            a[i] = arr[i];
        }
        for (int i=0; i<n-n/2; i++){
            b[i] = arr[i+n/2];
        }
        // magic
        mergesort(a);
        mergesort(b);
//        inversion(a,b);
        // merge these 'a' and 'b'
        merge(a,b,arr);
        // delete a and b : for space complexity
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {109,33,89,27,60,10,70};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
