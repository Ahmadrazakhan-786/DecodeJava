package OOPS;

interface P{
    void display();
}

interface Q{
    void show();
}

class R implements P,Q{
    public void show(){
        System.out.println("Showing from Q");
    }

    public void display(){
        System.out.println("Displaying from P");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        R obj = new R();
        obj.display();
        obj.show();
    }
}
