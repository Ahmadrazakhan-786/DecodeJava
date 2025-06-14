package OOPS;

class A {
    private int number = 10;

    void show() {
        System.out.println("Inside A: number = " + number); // ✅ works
    }
}
public class privateAccess {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.number); ❌ Error: number has private access
        obj.show(); // ✅ only method can access private data
    }
}
