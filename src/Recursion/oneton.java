package Recursion;

import java.util.Scanner;

public class oneton {
    // Method-1:  globally initialized
//    static int n;
//    public static void print(int x){
//        if (x>n) return; // base case
//        System.out.println(x); // work
//        print(x+1); // call
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n :");
//         n = sc.nextInt();
//        print(1);

    // Method-2: Using extra parameters:
        public static void print(int x, int n){
        if (x>n) return; // base case
        System.out.println(x); // work
        print(x+1,n); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
         int n = sc.nextInt();
        print(1,n);
    }
}
