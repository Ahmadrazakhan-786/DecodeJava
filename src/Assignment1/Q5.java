package Assignment1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radius of the circle :");
//        double r = sc.nextDouble();
//        double a = 3.145 * r * r;
//        System.out.println("The area of circle is :"+a);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount :");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        double r = sc.nextDouble();
        System.out.println("Enter time (in years) :");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("The simple interest is :"+si);

    }
}
