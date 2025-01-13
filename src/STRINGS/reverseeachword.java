package STRINGS;

import java.util.Scanner;

public class reverseeachword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
//        reverse(sb,2,4); // to reverse part of stringbuilder
//        System.out.println(sb);
//        reverse(sb,0,sb.length()-1); // to reverse whole sentence
//        System.out.println(sb);
        int i=0, j=0;
        while (j<n){
           if (sb.charAt(j)!=' ') j++;
           else {
               reverse(sb,i,j-1);
               i = j+1;
               j = i;
           }
        }
        reverse(sb,i,j-1); // for last word reverse
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb, int i, int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
}
