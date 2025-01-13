package STRINGS;

import java.util.Scanner;

public class stringbuilderinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder(s);
        System.out.println(a);
        a.setCharAt(1,'q');
        System.out.println(a);
    }
}
