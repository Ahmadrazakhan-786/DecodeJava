package Assignment5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        // eg: raja = rajaajar
        StringBuilder reverse = new StringBuilder(s).reverse();
        StringBuilder result = new StringBuilder(s).append(reverse);
        System.out.println(result);


    }
}
