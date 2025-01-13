package Loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // 1 3 5 7 ...
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            System.out.println(i);
        }
    }
}

