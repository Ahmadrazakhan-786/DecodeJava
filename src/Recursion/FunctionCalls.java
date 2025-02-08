package Recursion;

public class FunctionCalls {
    public static void mango(){
        System.out.println("hiii im in mango");
    }
    public static void banana(){
        System.out.println("hiii im in banana");
        mango();
    }
    public static void apple(){
        System.out.println("hiii im in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("im in main method");
        apple();
    }
}
