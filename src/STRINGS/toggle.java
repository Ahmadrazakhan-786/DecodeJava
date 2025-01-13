package STRINGS;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings : ");
        StringBuilder x = new StringBuilder(sc.nextLine());
        int n = x.length();

        for (int i=0; i<n; i++){
            char ch = x.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 65 && ascii <= 90){ // capital
                ascii += 32;
                ch = (char)ascii;
                x.setCharAt(i,ch);
            }
            else if (ascii >= 97 && ascii <= 122) { // small
                ascii -= 32;
                ch = (char) ascii;
                x.setCharAt(i, ch);
            }
        }
        System.out.println(x);
    }
}
