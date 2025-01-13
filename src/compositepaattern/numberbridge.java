package compositepaattern;

import java.util.Scanner;

public class numberbridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i=1; i<=2*n-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        for (int i=1; i<=n; i++){ // rows
            int a=1;
            for (int j=1; j<=n+1-i; j++){ // number
                System.out.print(a++ + " ");
            }
            for (int j=1; j<=2*i-1; j++){ // spaces
                System.out.print(" " + " ");
                a++; // imp step
            }
            for (int j=1; j<=n+1-i; j++) { // stars
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
