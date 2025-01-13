package TwoDimensionalArray;

import java.util.Scanner;

public class RnoandMarks {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        Scanner sc = new Scanner(System.in);

        int m = arr.length;
        int n= arr[0].length;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
