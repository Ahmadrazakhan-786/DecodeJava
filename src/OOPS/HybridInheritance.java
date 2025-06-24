package OOPS;

interface x{
    void methodA();
}

interface y{
    void methodB();
}

class z implements x,y{
    public void methodA(){
        System.out.println("Method A from interface A");
    }


    public void methodB() {
        System.out.println("Method B from interface B");
    }

    public void methodC(){
        System.out.println("Method C from class C");
    }
}

class T extends z{
    void methodD(){
        System.out.println("Method D  from class D");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        T obj = new T();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}
