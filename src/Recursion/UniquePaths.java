package Recursion;

import java.util.Scanner;

public class UniquePaths {
    public static int unique(int m, int n){
        if(m==1 || n==1) return 1; // iska matlab agar ek hi path hai to return 1 kar diya
        int rightWays = unique(m,n-1);
        int dowWays = unique(m-1,n);
        return rightWays + dowWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(unique(m,n));
    }
}
