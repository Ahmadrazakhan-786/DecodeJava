package Recursion;

import java.util.Scanner;

public class BinaryStrings {
    public  static  void printStrings(String s, int n){
        int m = s.length();
        if (m==n){
            System.out.println(s);
            return;
        }
//        printStrings(s+0,n);   // to print all possible
//        printStrings(s+1,n);    // combinations

        if (m == 0 || s.charAt(m-1) == '0'){ // agr string empty ho ya last string 1 ho
            printStrings(s+0,n);
            printStrings(s+1,n);
        }
        else printStrings(s+0,n); // agr last string 1 ho to 0 add kro
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        printStrings("",n);
    }
}
