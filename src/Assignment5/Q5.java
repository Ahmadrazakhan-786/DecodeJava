package Assignment5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        // reverse
        String x = "";
        for (int i = s.length()-1; i>=0; i--){
            x += s.charAt(i);
        }
        String res = s + x;
        System.out.println(res);
    }
}
