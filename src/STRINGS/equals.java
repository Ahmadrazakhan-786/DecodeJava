package STRINGS;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s==b); // false
        System.out.println(s==c); // false
        System.out.println(s.equals(b)); // true: in java equal operator is used for strings
        System.out.println(s.equals(c)); //true
    }
}
