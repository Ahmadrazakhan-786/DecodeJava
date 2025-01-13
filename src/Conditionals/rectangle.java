package Conditionals;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int l = sc.nextInt();
        System.out.println("Enter the breadth :");
        int b = sc.nextInt();
        int area = (l*b);
        int perimeter = 2*(l+b);

        if (area>perimeter) System.out.println("Area is greater");
        if (perimeter>area) System.out.println("perimeter is greater");
        if (area == perimeter) System.out.println("neither area nor perimeter is greater");
    }
}
