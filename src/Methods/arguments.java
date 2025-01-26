package Methods;

public class arguments {
    public static void greet(String name){
        System.out.println("good morning " + name);
    }
    public static void main(String[] args) {
        greet("Ahmad");
        sum(7,2);
        intro("ark",21); // order should be same as of that argument passed
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void intro(String name, int age){
        System.out.println("Hello "+name+" your age is : "+age);
    }
}
