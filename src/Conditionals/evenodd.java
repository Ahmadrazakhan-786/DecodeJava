package Conditionals;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
