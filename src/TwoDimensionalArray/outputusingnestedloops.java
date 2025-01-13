package TwoDimensionalArray;

import java.util.Scanner;

public class outputusingnestedloops {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");

        //length of array :
        int m = arr.length; // no. of rows or lines
        int n = arr[0].length; // no. of columns
//        System.out.println(n);

        // input of 2d Array:
        for (int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output of 2d Array:
        for (int i=0; i<m; i++){ // rows
            for (int j=0; j<n; j++){ // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
