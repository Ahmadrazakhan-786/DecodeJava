package PatternPrinting;

import java.util.Scanner;

public class startraingleflipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i+j)>n) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}