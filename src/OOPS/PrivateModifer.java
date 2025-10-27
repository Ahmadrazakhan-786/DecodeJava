package OOPS;
class studwa{
    String name;
    private int age;
    private int roll;

    studwa(String name, int age, int roll){ // constructor
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    void print(){ // inside class we can access private data members
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }
}

public class PrivateModifer {
    public static void main(String[] args) {
        studwa s = new studwa("ark", 20, 60); // we can access with the help of constructor as it was in same class
        s.name = "ark"; // this will not give error as it is not private
//        s.age = 20; this will give error as we cant access private data members outside the class
//        s.roll = 60; same
        s.print();
    }
}
