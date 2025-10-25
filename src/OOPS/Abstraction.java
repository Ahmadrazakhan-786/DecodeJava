package OOPS;

abstract class Car{
    abstract public void fueltype(); // abstract method-> dont have body just declare it
    public void color(){ // normal method: not mandatory
        System.out.println("Black");
    }
}

class Mahindra extends Car{
    // now use abstract method otherwise it will give error
    public void fueltype(){ //
        System.out.println("Diesel");
    }
}

class Tata extends Car{
    public void fueltype(){
        System.out.println("Petrol");
    }
}

public class Abstraction { // it can  be  achieved with either abstract classes or interfaces
    public static void main(String[] args){
        // we have to create object of mahindra class not of abstract class->car:
        Mahindra m = new Mahindra();
        m.fueltype();
        m.color();
        Tata t = new Tata();
        t.fueltype();
        t.color();
    }
}
//Note:
 // 1.We can create object from class.
// 2.We can't create an object of abstract class
//3.There is also a special type of abstract method-> Abstract method which dont have body just declare it

