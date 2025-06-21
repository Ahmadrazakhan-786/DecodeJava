package OOPS;

class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing...");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
