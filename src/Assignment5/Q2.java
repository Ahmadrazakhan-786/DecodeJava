package Assignment5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        int constantCount = 0;
        s = s.toLowerCase();

        // counting no. of constants in a given string:
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >='a'&& ch <='z' && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' ){
                constantCount++;
            }
        }
        System.out.println("No. of Constants are : " + constantCount);
    }
}
