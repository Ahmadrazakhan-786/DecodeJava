package Recursion;

import java.util.ArrayList;

public class StringBasics {
    public static void change(String s){
        s = "khan"; // matlab (string)ahmad ki value change nhi ki gyi i.e. it's a pass by value
    }
    public static void change2(ArrayList<String> al){
        al.add("Md"); // jab arraylist ko method me bhezte hai to wo pass by refernce jaati hai i.e changes hoti hai
    }
    public static void main(String[] args) {
        String s = "Ahmad";
        change(s);
        System.out.println(s);

        ArrayList<String> al = new ArrayList<>();
        al.add("Ahmad");
        al.add("Raza");
        al.add("Khan");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }
}
// Note: jab v hm kisi string ko method me bhezte hai to uski copy jati hai
