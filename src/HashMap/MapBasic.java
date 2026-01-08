package HashMap;

import java.util.HashMap;

public class MapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>(); // key,value
        map.put("Ahmad",60);
        map.put("Zaid",61);
        map.put("Ashir",605);
        map.put("Sahil",610);
        System.out.println(map);
        System.out.println(map.containsKey("Ahmad")); //True
        System.out.println(map.containsValue(15)); // False
        map.put("Ahmad",58); // it will overwrite the existing values
        System.out.println(map);
        map.put("Raza",58);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("Ahmad");
        System.out.println(map);
        System.out.println(map.get("Zaid")); // will return the value of that key

        // NOTE: In every map there will be unique key but values can be repeated
    }
}
