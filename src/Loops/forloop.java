package Loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("hello world");
        }
    }
}
