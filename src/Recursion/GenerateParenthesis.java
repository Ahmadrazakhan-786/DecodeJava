package Recursion;

import java.util.Scanner;

public class GenerateParenthesis {
    public static void parenthesis(int open, int close, int n, String s ){
        if (s.length() == 2*n){ // base case
            System.out.println(s);
            return;
        }
        if (open<n) parenthesis(open+1,close,n,s+"("); // when " " is there we only send opening brackets
        if (close<open) parenthesis(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        parenthesis(0,0,n,"");
    }
}
