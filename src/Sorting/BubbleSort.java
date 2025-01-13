package Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,-1};
        int n = arr.length;
        print(arr);
        // Bubble sort : 1
//        for (int x=1; x<=n-1; x++){ // 1st loop is used for passes
//            for (int i=0; i<n-1; i++){
//                if (arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
        // Bubble Sort : 2
//        for (int x=0; x<n-1; x++){ // 1st loop is used for passes
//            for (int i=0; i<n-1-x; i++){  // - x isliye kiya qki har pass me 1 step kam krna tha
//                if (arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
        // Bubble sort Optimised
        for (int x=0; x<n-1; x++) { // 1st loop is used for passes
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break;
        }
        print(arr);
    }
}
