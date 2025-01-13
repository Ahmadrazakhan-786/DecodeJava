package Revision;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
//        int[] arr = new int[7];
//        Scanner sc = new Scanner(System.in);
//        for (int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        int[] arr = {7,8,0,8,6,1,2};
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i<7; i++){
            arr[2] = 1;
            System.out.print(arr[i] + " ");
        }
    }
}
