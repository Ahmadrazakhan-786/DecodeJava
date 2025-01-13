package Arrays;

public class dutchflagalgo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 0, 0, 0, 2, 0, 1, 2, 0, 2};
        int n = arr.length;
        // method-1 :
//        int numof0s = 0 ,  numof1s = 0;
//        for (int i = 0; i < n; i++) {
//                if (arr[i] == 0) numof0s++;
//                if (arr[i] == 1) numof1s++;
//            }
//        for (int i = 0; i < n; i++) {
//            if (i < numof0s) arr[i] =0;
//            else if (i < numof0s + numof1s) arr[i] = 1;
//            else arr[i] = 2;
//           }

        // method-2 :
        int mid = 0, high = n - 1, low = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;
            else { // arr[mid] = 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

