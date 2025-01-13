package Loops;

import java.util.Scanner;

public class oddnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i+=2){
            System.out.println(i);
        }
    }
}
