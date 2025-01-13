package Assignment4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i*2-1; j++ ){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
