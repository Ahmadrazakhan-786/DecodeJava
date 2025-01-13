package Conditionals;

import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n>99 && n<1000) System.out.println("3 digit number");
        else System.out.println("not a 3 digit number");
    }
}
