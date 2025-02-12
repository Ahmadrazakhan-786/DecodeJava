package Recursion;

import java.util.Scanner;

public class sumReturntype {
    //Method-2: using return type
    public static int sum(int n){
        if (n==1 || n == 0) return n;
        int ans = n + sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
