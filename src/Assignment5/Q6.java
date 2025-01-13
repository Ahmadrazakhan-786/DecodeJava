package Assignment5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        if (s.length()<10){
            int result = Integer.parseInt(s);
            System.out.println(result);
        }
        else {
            System.out.println("cannot find");
        }

    }
}
