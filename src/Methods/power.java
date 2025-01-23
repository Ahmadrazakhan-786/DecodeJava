package Methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int pow = 1;
//        for (int i=1; i<=b; i++){
//            pow *= a;
//        }

        System.out.println((int)Math.pow(4,5)); // builtin library function
        int a=5, b=7, c=9;
        System.out.println(Math.max(a,Math.max(b,c)));
        int x=1, y=7, z=2, t=5;
        System.out.println(Math.min(Math.min(x, y), Math.min(z, t)));
    }
}
