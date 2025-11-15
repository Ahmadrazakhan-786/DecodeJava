package OOPS;
public class Polymorphism2 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static String sum(String x, String y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(sum(7,6));
        System.out.println(sum(7,8,6));
        System.out.println(sum("Ahmad ", "Raza"));
    }
}
// Note: This is method overloading i.e. compile time polymorphism
// it is also called static or early binding
// it is slightly fast
