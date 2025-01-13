package Basicsofjava;

import java.util.Scanner;

public class sumoftwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int x = sc.nextInt();
        System.out.println("Enter the second num :");
        int y  = sc.nextInt();
        System.out.println("The sum of two num is : "+(x+y));
    }
}
