package Assignment2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int a = sc.nextInt();
        System.out.println("Enter second num : ");
        int b = sc.nextInt();
        System.out.println("Enter third num : ");
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) System.out.println(a + "is smallest");
            else System.out.println(c + "is smallest");
        } else {
            if (b < c) System.out.println(b + "is smallest");
            else System.out.println(c + "is smallest");
        }
    }
}
