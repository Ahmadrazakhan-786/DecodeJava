package STRINGS;

public class deleteandinsert {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s); // abcef
        s.append("ahmad");
        System.out.println(s); // abcefahmad
        s.delete(2,6); // deletes characters from (2 to 6-1)
        System.out.println(s); // abhmad
        s.insert(2,'k');
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
