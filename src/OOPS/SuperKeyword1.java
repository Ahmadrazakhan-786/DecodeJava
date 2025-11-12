package OOPS;
class ANIMALWA{
    String color = "White"; // Invoking parent class variable
}

class DOGGY extends ANIMALWA{
    String color = "Black";
    void print(){
        System.out.println(color); // prints the color of dog class i.e. base class
        System.out.println(super.color); // prints the color of ANIMAL class i.e. parent class
    }
}
public class SuperKeyword1 {
    public static void main(String[] args) {
        DOGGY d = new DOGGY();
        d.print();
    }
}
// Note: Super Keyword comes into the picture when both parent class and child class have same method name
// Super keyword can be used by invoking parent class variable, method, and constructor
// iska matlab ye hai ke same method name hai aur ham chahte hai ki parent class ka method
// use karna chate hai us case me super keyword kaam aati hai
