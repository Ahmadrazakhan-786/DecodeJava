package Conditionals;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int a = sc.nextInt();
        System.out.println("Enter second num : ");
        int b = sc.nextInt();
        System.out.println("Enter third num : ");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b){
            System.out.println("valid traiangle");
        } else {
            System.out.println("invalid triangle");
        }

    }
}
