package Recursion;

import java.util.ArrayList;

public class Subsets {
    static ArrayList<String> arr = new ArrayList<>(); // global
    public static void subsets(int i, String s, String ans){
        if (i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i); // taking a,b,c,d for its ith character
        subsets(i+1,s,ans); // not take
        subsets(i+1,s,ans+ch); // take
    }
    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>(); // reset
        subsets(0,s,"");
        System.out.println(arr);
    }
}
