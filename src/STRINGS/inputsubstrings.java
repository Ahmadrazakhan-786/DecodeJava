package STRINGS;

import java.util.Scanner;

public class inputsubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        int n = s.length();

        for (int i=0; i<=n; i++){
            for (int j=i+1; j<=n; j++){
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }
}
