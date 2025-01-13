package Assignment3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer : ");
        int n = sc.nextInt();
        int a = n*(n+1)/2;
        System.out.println("the sum of natural num is :"+a);
    }
}
