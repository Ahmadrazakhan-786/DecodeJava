package PatternPrinting;

import java.util.Scanner;

public class numbersquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m :");
        int m = sc.nextInt();

        for (int i=1; i<=m; i++){ //rows
            for (int j=1; j<=m; j++){ //columns
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
