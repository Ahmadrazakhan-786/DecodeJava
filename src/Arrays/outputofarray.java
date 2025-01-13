package Arrays;

import java.util.Scanner;

public class outputofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        int[] arr = new int[7];

        // input -> using loop:
        for (int i=0; i<=6; i++){
            arr[i] = sc.nextInt();
        }

        // output -> using loop:
        for (int i=0; i<=6; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
