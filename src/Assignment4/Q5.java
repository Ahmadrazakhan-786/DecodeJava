package Assignment4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter m :");
        int m = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
