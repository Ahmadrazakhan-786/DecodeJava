package Recursion;

public class StringTraversal {
    public static void print(int i, String s){
        if (i==s.length()) return;
        System.out.println(s.charAt(i));
        print(i+1,s);
    }
    public static void main(String[] args) {
        String s = "Ahmad";
        print(0,s);
    }
}
