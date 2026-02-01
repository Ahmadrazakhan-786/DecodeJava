package Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,-6,20,-8};
        int n = arr.length;
        print(arr);

        for (int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1; // ye min ele ke idx nikalne ke liye hai
            for (int j=i; j<n; j++){
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            // swap arr[i] and arr[mindx]
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
        // M-2:
        // Har pass me largest element nikaal ke LAST me daalna hai
        // Aur final array ascending order me hona chahiye

//        for (int i=n-1; i>0; i--){
//            int max = Integer.MIN_VALUE;
//            int mindx = -1; // ye max ele ke idx nikalne ke liye hai
//            for (int j=0; j<i; j++){
//                if (arr[j] > max){
//                    max = arr[j];
//                    mindx = j;
//                }
//            }
//            // swap arr[i] and arr[mindx]
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//        print(arr);
//    }
}
