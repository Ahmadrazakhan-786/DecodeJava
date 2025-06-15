package OOPS;

class studentwa{
    String name;
    int age;

   public void studentwa(String name){
        System.out.println(name);
    }

    public void studentwa(int age){
        System.out.println(age);
    }

    public void studentwa(String name, int age){
        System.out.println(name + age);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        studentwa s = new studentwa();
        s.name =  "ahmad";
        s.age = 21;

        s.studentwa(s.name, s.age);

        // it is also called function overloading :
        //  same function name with different parameters

    }
}
