package STRINGS;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.append(94);
        System.out.println(s);
        s.append("*");
        System.out.println(s);
        char[] ch = {'a','r','k'};
        s.append(ch);
        System.out.println(s);
        int[] arr = {7,5,3,2,0,1};
        s.append(arr); // doesn't work, address is appended
        System.out.println(s);
    }
}
