package homework;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        // num triangle flipped:
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if ((i+j)>n) System.out.print(j + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }

    }
}
