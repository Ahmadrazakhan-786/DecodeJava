package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
//        for (int i = 1; i <=100 ; i++) {
//            if (i%2!=0)
//              System.out.println(i);
//        }
        // using continue keyword:
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0) {
                continue;
            }
                System.out.println(i);
        }

    }
}
