package Recursion;

public class SkipCharacter { // remove all occurrences of a from string
    public static void skip(int i, String s, String ans){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a') ans += s.charAt(i);
        skip(i+1,s,ans); // aage ke kaam ke liye recursion laga do
    }
    public static void main(String[] args) {
        String s = "ark";
        skip(0,s,"");
    }
}
