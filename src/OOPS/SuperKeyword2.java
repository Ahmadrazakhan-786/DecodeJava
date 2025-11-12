package OOPS;
class Animall{
    void eat(){
        System.out.println("Eating..."); // Invoking parent class method
    }
}
class Dogeshh extends Animall{
    void eat(){
        System.out.println("Eating bread...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    void work(){
        super.eat(); // prints the parent class method
        bark();
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {
        Dogeshh d = new Dogeshh();
        d.work();
    }
}
