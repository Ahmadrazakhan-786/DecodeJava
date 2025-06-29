package OOPS;

class Janwar{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dogesh extends Janwar{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class catwa extends Janwar{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Janwar j = new Janwar();
        j.sound();

        Dogesh d = new Dogesh();
        d.sound();

        catwa c = new catwa();
        c.sound();
    }
}
// Function Overriding or Method Overriding
