package Assignment2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side : ");
        int a = sc.nextInt();
        System.out.println("Enter second side : ");
        int b = sc.nextInt();
        System.out.println("Enter third side : ");
        int c = sc.nextInt();

        if (a==b && b==c) System.out.println("equilateral triangle");
        else if (a==b || b==c || c==a ) {
            System.out.println("isosceles triangle");
        }
        else System.out.println("scalene triangle");
    }
}
