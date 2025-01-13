package Basicsofjava;

import java.util.Scanner;

public class halfnumtypecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int x = sc.nextInt();
       double y = (double) x;
        System.out.println(y/2);
    }
}
