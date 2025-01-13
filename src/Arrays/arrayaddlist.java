package Arrays;

import java.util.ArrayList;

public class arrayaddlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(60);
        System.out.println(list + " " + list.size());
        list.add(650);
        System.out.println(list + " " + list.size());
        list.add(55);
        System.out.println(list + " " + list.size());
        list.remove(1);
        System.out.println(list + " " + list.size());

    }
}
