package Assignment5;


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine().toLowerCase();

        // to print no. of vowels and which type of vowel
        int vowels = 0;
        String x = "";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
               x += s.charAt(i);
               vowels++;
            }
        }
        System.out.println(vowels); // no. of vowels
        System.out.println(x); // which vowel

    }
}
