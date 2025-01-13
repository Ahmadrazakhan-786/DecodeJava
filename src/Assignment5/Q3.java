package Assignment5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String s = sc.nextLine();

        // reverse the second half of the string of even length
        if (s.length()%2!=0){
            System.out.println("The given string is not of even length");
        }
        else {
            int mid = s.length()/2;
            String firstHalf = s.substring(0,mid);
            String secondHalf = "";
            for (int i=s.length()-1; i>=mid;i--){ //reversing second half
                secondHalf += s.charAt(i);
          }
            String result = firstHalf + secondHalf; // adding first and second half
            System.out.println("The required string is : " + result);
        }
    }
}
