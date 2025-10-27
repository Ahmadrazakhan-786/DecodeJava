package OOPS;

// Class Stud has no access modifier → default access
// ✅ Default = accessible only within the same package
class Stud {
    // Variables with no access modifier → default
    String name;  // default
    int age;      // default
    int roll_no;  // default

    // Method with no access modifier → default
    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}

public class DefaultAccessModifiers {
    public static void main(String[] args) {
        Stud s = new Stud(); // ✅ Works because AccessModifiers is in SAME package

        // Accessing default variables → ✅ allowed within same package
        s.name = "Ahmad";
        s.age = 21;
        s.roll_no = 60;

        s.print(); // ✅ Works, default method accessible within package
    }
}
