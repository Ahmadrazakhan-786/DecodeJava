package STRINGS;

public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String q =  "Raghav";
        String t = new String("Raghav"); // new keyword helps to create other space or memory
        // we want raghav to madhav:
//        s.charAt(0) = 'M'; // Error
//        s.charAt(2) = 'D'; // Error: we cant change the string as it is immutable
        System.out.println(s);
        // note: interning is used to save space

    }
}
