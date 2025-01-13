package Conditionals;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price :");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price :");
        int sp = sc.nextInt();

        if (cp>sp) System.out.println("loss is "+(cp-sp));
        if (sp>cp) System.out.println("profit is "+(sp-cp));
        if (cp==sp) System.out.println("no profit no loss");

    }
}
