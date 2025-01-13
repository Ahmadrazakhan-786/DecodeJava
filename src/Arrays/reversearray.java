package Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {50, 60, 75, 85, 96};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // METHOD->1
        for (int i = 0; i < arr.length / 2; i++) {
            int j = (arr.length - 1 - i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
            // METHOD->2: USING TWO POINTER
//        int i=0, j=arr.length-1;
//        while (i<=j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

