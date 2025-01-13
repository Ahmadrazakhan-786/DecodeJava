package Assignment5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String n = sc.nextLine();

        // update odd position with # with 0-based indexing
        String str = "";
        for (int i=0; i<n.length(); i++){
            if (i%2!=0){
                str += "#";
            }
            else {
                str += n.charAt(i);
            }
        }
        System.out.println(str);
    }
}
