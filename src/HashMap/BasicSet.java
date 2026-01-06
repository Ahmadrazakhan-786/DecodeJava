package HashMap;

import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // interface
        //Insert: TC = O(1)
        set.add(10);
        set.add(200);
        set.add(105);
        set.add(-8);
        System.out.println(set); // print the value in random order
        // search: true/false : TC = O(1)
        System.out.println(set.contains(-8)); // true
        System.out.println(set.size()); // TC =O(1)
        set.add(105); // doesn't contain duplicates
        System.out.println(set);
        System.out.println(set.size());
        // Remove : TC = O(1)
        set.remove(-8);
        System.out.println(set + " " + set.size());

        //NOTE: if we want to remove an ele which is not present in the sets then it will
        // not give error instead it will give the o/p of the sets which is present

        Object[] arr = set.toArray(); // conversion of sets to array but make sure the datatype of arr should be object
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }
}
