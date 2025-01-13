package Arrays;

public class revtwopointer {
    public static void main(String[] args) {
        int[] arr = {50, 60, 75, 85, 96};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int i = 0, j = arr.length - 1;
//        int i = 1, j = 3; PART OF ARRAY REVERSE
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ele : arr){
            System.out.print(ele +  " ");
        }
        System.out.println();
    }
}
