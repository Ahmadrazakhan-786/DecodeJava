package Recursion;

import java.util.Scanner;

public class Ascending {
    public static void print(int n){
        if(n==0) return;
//        print(n-1); // yaha se
        System.out.print(n + " "); // yaha tak 1 to n ans dega :    other-> fir yaha se
        print(n-1);
        System.out.print(n + " "); // yaha tak n to 1 to 1 to n
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
