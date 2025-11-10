package Recursion;

public class Reverse {
    public static void reverse(int n, int r) {
        if (n==0){
            System.out.println(r);
            return;
        }
        reverse(n / 10, r * 10 + n % 10);
    }
    public static void main(String[] args) {
        int n = 6587;
//        int r = 0;
//        while (n != 0){
//            r = r*10;
//            r += (n%10);
//            n = n/10;
//        }
        reverse(n,0);
    }
}
