package STRINGS;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 19:-> 3+16
        StringBuilder x = new StringBuilder(10);
        System.out.println(x.capacity());

        // note: by default capacity in java is 16

    }
}
