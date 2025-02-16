package Recursion;

import java.util.Scanner;

public class fibonnaci {
    public static int fib(int n){
        if (n<=1) return n; // base case
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonnaci number of : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
