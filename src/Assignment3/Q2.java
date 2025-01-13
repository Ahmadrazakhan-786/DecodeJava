package Assignment3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n = sc.nextInt();

        // multiplication program:
        for (int i=1; i<=10; i++){
             System.out.println(n*i);
        }
    }
}
