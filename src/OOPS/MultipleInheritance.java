package OOPS;

interface P{
    void display(); // just declare the method , don't provide body
}

interface Q{
    void display(); // just declare the method , don't provide body
}

class R implements P,Q{
    public void display(){
        System.out.println("Displaying from R");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        R obj = new R();
        obj.display();
    }
}
// Note: we cant directly implement multiple inheritance in java but there is another way using 'interface':
// it doesn't implement directly as it creates ambiguity in the code and bcz of ambiguity compiler will not
// - understand to run the method of which class
// object hmesha class ka bnta hai , interface ka nhi