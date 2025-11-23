package Recursion;

public class TowerOfHanoi {
    public static void hanoi(int n, char a, char b, char c){
        if (n==0) return;
        // n-1 disks from A to B via C
        hanoi(n-1,a,c,b); // beech wala via hai
        // largest from A to C
        System.out.println(a+"->"+c);
        // n-1 disks from B to C via A
        hanoi(n-1,b,a,c);
    }
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
}
