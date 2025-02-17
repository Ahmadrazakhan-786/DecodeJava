package Recursion;

import java.util.Scanner;

public class StairPath {
    public static int stairs(int n){
        if (n<=2) return n; // base case
        return stairs(n-1) + stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(stairs(n));
    }
}
