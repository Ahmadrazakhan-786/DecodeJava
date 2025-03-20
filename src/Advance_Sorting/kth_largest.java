package Advance_Sorting;

public class kth_largest {
    static int ans;
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo], pIdx = lo;
        int smallerCount = 0;
        for (int i=lo+1; i<=hi; i++){ // lo+1 se isliye start kiya qki uske age ele check krna tha
            if (arr[i] <= pivot) smallerCount++; // ele ko pivot ke left part mein rkhna
        }
        int correctIdx = pIdx + smallerCount;
        swap(arr, pIdx, correctIdx);
        // partition:
        int i = lo, j = hi;
        while (i<correctIdx && j>correctIdx){
            if(arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public  static  void quickselect(int[] arr, int lo, int hi,int k){
        if (lo>hi) return;
//        if (lo == hi){
//            if (lo == k-1) ans = arr[lo];
//            return;
//        }
        // pivot (arr[lo]) ko sahi jagah pe rakho
        // & left part mein <= pivot
        int idx = partition(arr,lo,hi);
        if (idx == k-1){  // idx == k-1 means kth smallest
           ans = arr[idx];
           return;
        }
        if(k-1 < idx) quickselect(arr,lo,idx-1,k);
        else quickselect(arr,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k = 4;
        ans = -1;
        quickselect(arr,0,n-1,k); // here use n-k+1 for kth largest element
        System.out.println(ans);
    }
}
// NOTE: FOR Kth largest element use n-k+1 instead of k