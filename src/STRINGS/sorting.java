package STRINGS;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        // note: char arr can be sorted using built-in function
        char[] ch = {'p','a','n','i'};
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        // now we have to sort the strings

        String s =  "ahmad";
        char[] ph = s.toCharArray();
        for (char tele : ph){
            System.out.print(tele);
        }
        System.out.println();
        Arrays.sort(ph);
        for (char tele : ph){
            System.out.print(tele);
        }
        System.out.println();

        // now we have to sort string builder
        StringBuilder sb = new StringBuilder("khan");
        char[] dh = sb.toString().toCharArray();

        for (char ele : dh){
            System.out.println(dh);
        }
        System.out.println();
        Arrays.sort(dh);
        for (char ele : dh){
            System.out.println(dh);
        }
        System.out.println();

    }
}
