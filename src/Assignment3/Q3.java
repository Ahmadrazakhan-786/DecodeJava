package Assignment3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();

        // fibonacci series:
        int a=0, b=1, c;
        System.out.print(a + " " + b + " ");
        for (int i=3; i<=n; i++){
            c = a + b;
            System.out.print(c + " "); // 3rd term
            a = b;
            b = c;
        }
    }
}
