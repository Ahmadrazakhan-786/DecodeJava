package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(30); a.add(40); a.add(70);
        List<Integer> b = new ArrayList<>();
        b.add(35); b.add(40);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(20);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        // Method-1: To get all elements of array
//        for (int i=0; i<l.size(); i++){
//            System.out.println(l.get(i) + " ");
//        }

       // Method-2:
       for (int i=0; i<l.size(); i++){
           List<Integer> x = l.get(i);
           for (int j=0; j<x.size(); j++){
               System.out.print(x.get(j) + " ");
           }
           System.out.println();
       }

       // To fetch particular element:
        System.out.println(l.get(1).get(1));

    }
}
