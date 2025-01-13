package STRINGS;

import java.util.Scanner;

public class inputtostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

       String s = "";
        s = s+n;
        System.out.println(s);
    }
}
