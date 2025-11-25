package Recursion;

public class PreInPost {
    public static  void pip(int n){
        if (n == 0) return;
        System.out.print(n + " "); // Pre
        pip(n-1);
        System.out.print(n +" "); // In
        pip(n-1);
        System.out.print(n +" "); // Post
    }
    public static void main(String[] args) {
        pip(3);
        // first find pip(1) and pip(2)
    }
}
