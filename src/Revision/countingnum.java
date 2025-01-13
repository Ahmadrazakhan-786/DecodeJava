package Revision;

import java.util.Scanner;

public class countingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        String x = n + "";
        System.out.println(x.length());
    }
}
