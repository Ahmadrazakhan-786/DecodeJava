package Arrays;

import java.util.ArrayList;

public class basicsofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10); // arr[0] = 10
        arr.add(1, 20); // for initializaton we use add:
        arr.add(2, 30);
        arr.add(3, 140);
        arr.add(4, 100);
        arr.add(5, 105);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " "); // arr[i]

        }
        System.out.println();
        arr.set(3, 786); // for modification we use set:
        System.out.println(arr);
        arr.add(95); // push back
        System.out.println(arr);
    }
}
