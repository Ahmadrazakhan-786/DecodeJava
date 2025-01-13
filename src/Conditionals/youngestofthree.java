package Conditionals;

import java.util.Scanner;

public class youngestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of ram : ");
        int a = sc.nextInt();
        System.out.println("Enter the age of shyam : ");
        int b = sc.nextInt();
        System.out.println("Enter the age of ajay : ");
        int c = sc.nextInt();

        if (a<b){
            if (a<c) System.out.println("ram is youngest");
            else System.out.println("ajay is youngest");
        }
        else{
            if (b<c) System.out.println("shyam is youngest");
            else
                System.out.println("ajay is youngest");
        }
    }
}
