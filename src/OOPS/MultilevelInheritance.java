package OOPS;

class D{
    void showA(){
        System.out.println("This is A");
    }
}

class E extends D{
    void showB(){
        System.out.println("This is B");
    }
}

class F extends E{
    void showC(){
        System.out.println("This is c");
    }
}

public class MultilevelInheritance { // it is a bottom up approach
    public static void main(String[] args) {
        F obj = new F();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
