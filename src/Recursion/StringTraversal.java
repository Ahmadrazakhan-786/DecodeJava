package Recursion;

public class StringTraversal {
    public static void print(int i, String s){
        if (i==s.length()) return;
        System.out.println(s.charAt(i)); // to sbse pehle A print hoga
        print(i+1,s); // fir aage ko print krne ke liye recursion laga do
    }
    public static void main(String[] args) {
        String s = "Ahmad";
        print(0,s);
    }
}
