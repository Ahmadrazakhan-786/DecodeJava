package Conditionals;

import java.util.Scanner;

public class fivedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n>9999 && n<100000) System.out.println("5 digt num");
        else System.out.println("not a five digit num");
    }
}
