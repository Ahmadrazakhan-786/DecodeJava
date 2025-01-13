package Loops;

import java.util.Scanner;

public class compositenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // use of break keyword:
        int x = 0; // 0 means prime
        for (int i = 2; i <= n-1 ; i++) {
            if (n%i==0){ // i is a factor of n
                System.out.println("composite num");
                x = 1; //  1 means composite
                break;

            }
        }
        if (n==1) System.out.println("neither prime noe composite");
        else if (x==0) System.out.println("prime num");
    }
}
