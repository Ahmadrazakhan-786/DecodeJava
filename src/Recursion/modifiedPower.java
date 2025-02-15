package Recursion;

import java.util.Scanner;

public class modifiedPower {
    public static int power(int a, int b){
        if (b==0) return 1; // base case: TC-> O(logb)
        int ans = power(a,b/2);
        if (b%2==0)  return ans * ans;
        else return ans * ans * a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println( power(a,b));
    }
}
