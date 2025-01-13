package Arrays;

import java.util.Arrays;

public class builtinMethods {
    public static void main(String[] args) {
        int[] arr = {54,30,12,5,65,35};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
