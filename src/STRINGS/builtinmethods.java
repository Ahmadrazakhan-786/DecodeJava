package STRINGS;

public class builtinmethods {
    public static void main(String[] args) {
        String s = "Ahmad Raza Khan";
        System.out.println(s.indexOf('K'));
        System.out.println(s.indexOf('a'));
        System.out.print(s.lastIndexOf('a')); // determine from last

        System.out.println();
        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b)); // (a-d) i.e.(97-100)

        String x = "Surajmal instititue";
        System.out.println(x.contains("insti"));
        System.out.println(x.startsWith("Sura"));
        System.out.println(x.endsWith("tue"));
    }
}
