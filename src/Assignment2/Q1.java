package Assignment2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int n = sc.nextInt();

        if (n%4==0){
            System.out.println("leap year");
        } else System.out.println("not a leap year");
    }
}
