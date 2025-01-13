package PatternPrinting;

import java.util.Scanner;

public class rectanglepatttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the num of rows :");
        int n = sc.nextInt();

        for (int i=1; i<=m; i++){ //rows
            for (int j=1; j<=n; j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
