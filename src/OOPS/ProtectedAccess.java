package OOPS;

class B{
    protected int x = 20;
}

class C extends B{
    void display(){
        System.out.println("protected number : " + x);
    }
}

public class ProtectedAccess {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
