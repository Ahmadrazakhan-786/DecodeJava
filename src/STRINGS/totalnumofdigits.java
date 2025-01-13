package STRINGS;

import java.util.Scanner;

public class totalnumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        // simple method:
//        String s = n + "";
//        System.out.println(s.length());

        // using built in method:
        String x = Integer.toString(n);
        System.out.println(x);
        System.out.println(x.length());
    }
}
