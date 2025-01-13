package STRINGS;

public class modifystrings {
    public static void main(String[] args) {
        String s = "hello";
        // heylo: string is immutable in java but still we can modify but it is not recommended
        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);

        StringBuilder x = new StringBuilder("hello");
        System.out.println(x);
        x.setCharAt(2,'y');
        System.out.println(s);
    }
}
