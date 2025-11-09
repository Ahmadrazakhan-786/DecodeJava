package OOPS;
interface car{
    void start(); // just declare the method , don't provide body
}
class ElectricCar implements car{
    public void start(){
        System.out.println("Electric Car Starts");
    }
}
class DieselCar implements car{
    public void start(){
        System.out.println("This is a diesel car");
    }
}
public class Interface {
    public static void main(String[] args) {
        car c1 = new ElectricCar();
        car c2 = new DieselCar();
        c1.start();
        c2.start();
    }
}
