package OOPS;
class Bank{
    void RateofIntersest(){
        System.out.println("Rate of interest is 5%");
    }
}
class SBI extends Bank{
    @Override
    void RateofIntersest(){
        System.out.println("Rate of interest of SBI is 6%");
    }
}
class PNB extends Bank{
    @Override
    void RateofIntersest(){
        System.out.println("Rate of interest of PNB is 7%");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        PNB p = new PNB();
        b.RateofIntersest();
        s.RateofIntersest();
        p.RateofIntersest();
    }
}
// Note: The above program is of Method Overriding i.e. Run time polymorphism
// it is also called dynamic or late binding
// it is slightly slow
