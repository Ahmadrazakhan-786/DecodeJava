package OOPS;

class Janwar{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dogesh extends Janwar{
    @Override // without writing @Qverride the code will run fine but it is good practice to write
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
        Dogesh d = new Dogesh();
        catwa c = new catwa();
        j.sound();
        d.sound();
        c.sound();
    }
}
// Function Overriding or Method Overriding
