package homework;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        // reverse same alpha:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
