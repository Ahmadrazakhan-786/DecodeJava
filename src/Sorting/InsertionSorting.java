package Sorting;

public class InsertionSorting {
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,-42,-6,207,-8};
        int n = arr.length;
        print(arr);

//        for (int i=1; i<n; i++){ // n-1 passes
//            for (int j=i; j>=1; j--){
//              if (arr[j] < arr[j-1]){
//                  int temp = arr[j]; // swapping
//                  arr[j] = arr[j-1];
//                  arr[j-1] = temp;
//
//              }
//              else break;
//            }

        for (int i=1; i<n; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        print(arr);
    }
}
