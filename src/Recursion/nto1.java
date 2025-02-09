package Recursion;

import java.util.Scanner;

public class nto1 {
    public static void print(int n){
        if (n==0) return; // base case
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        print(n);
    }
}
