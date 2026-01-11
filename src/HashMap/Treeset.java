package HashMap;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(200);
        set.add(105);
        set.add(-8);

        for (int ele : set){
            System.out.print(ele + " "); // print the ele in sorted order
        }
        System.out.println();

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Ahmad",60);
        map.put("Zaid",61);
        map.put("Ashir",605);
        map.put("Sahil",610);

        for (String key : map.keySet()){
            System.out.println(key + " "+ map.get(key));// print the key in sorted order according to grammar
        }
    }
}
