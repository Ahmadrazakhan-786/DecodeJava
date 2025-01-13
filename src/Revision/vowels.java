package Revision;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            count++;
            if (ch == 'a' || ch =='A');
            if (ch == 'e' || ch == 'E');
            if (ch == 'i' || ch == 'I');
            if (ch == 'o' || ch == 'O');
            if (ch == 'u' || ch == 'U');
            System.out.println(count);
        }
    }
}
