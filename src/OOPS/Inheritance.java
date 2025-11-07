package OOPS;

//class parent{
//    void display(){
//        System.out.println("Parent class method");
//    }
//}
//
//class child extends parent{
//    void show(){
//        System.out.println("Child class method");
//    }
//}

class Vehicles{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class Cars extends Vehicles{
    String ftype;
    boolean sunroof;
    String brand;

}
public class Inheritance {
    public static void main(String[] args){
//        child c = new child();
//        c.show();
//        c.display(); // here we can access parent class method with the help of child class

        Cars c = new Cars();
        c.brand = "Maruti";
        c.price = 150000;
        c.mileage = 18.3;
        c.ftype = "petrol";
        c.color = "Red";
        c.sunroof = true;
        c.display();
        System.out.println(c.sunroof);

    }
}

// Note: Sub Class is same as Child class
// Super class is same as parent class
// child class ---> parent class : IS-A RELATIONSHIP
