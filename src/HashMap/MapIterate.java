package HashMap;

import java.util.HashMap;

public class MapIterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>(); // key,value
        map.put("Ahmad",60);
        map.put("Zaid",61);
        map.put("Ashir",605);
        map.put("Sahil",610);

        for(String key: map.keySet()){
//            System.out.println(key); // it will print all the keys of the map
//            System.out.println(map.get(key)); // it will print all the values of the map
              int val = map.get(key);
            System.out.println(key+" "+val);
        }
    }
}
