package GoodQsn;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        if (x>0 && y>0) System.out.println("1st quad");
        else if (x<0 && y>0) {
            System.out.println("2nd quad");
        } else if (x<0 && y<0) {
            System.out.println("3rd quad");
        } else if (x==0 && y==0) {
            System.out.println("origin");
        }
        else if (x==0 && y<0) {
            System.out.println("lies on -ve y-axis");
        } else if (x==0 && y>0) {
            System.out.println("lies on +ve y-axis");
        } else if (y==0 && x<0) {
            System.out.println("lies on -ve x-axis");
        } else if (y==0 && x>0) {
            System.out.println("lies on -ve y-axis");
//        } else if (x>0 && y==0) {
//            System.out.println("lies on +ve x-axis");
        } else System.out.println("4th quad");

    }
}
