package HashMap;

import java.util.HashSet;

public class SetIterate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,10};
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(200);
        set.add(105);
        set.add(-8);

        for (int ele : set){
            System.out.print(ele+ " ");
        }
        set.clear(); // remove all the sets
        System.out.println();
        System.out.println(set);
    }
}
