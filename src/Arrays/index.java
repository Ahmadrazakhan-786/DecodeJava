package Arrays;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for (int i=0; i< arr.length; i++){
            if (i%2==0){
                arr[i] += 10;
            }else{
                arr[i] *= 2;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
