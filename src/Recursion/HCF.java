package Recursion;

import java.util.Scanner;

public class HCF {
    public static int hcf(int a, int b){
        for (int i=Math.min(a,b); i>=1; i--){
            if (a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static int gcd(int a, int b){
        if (b%a==0) return a;
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
