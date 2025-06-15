package OOPS;

class stu{
    String name;
    int age;

    stu(String n, int a){ // parametrized
        name = n;
        age = a;
    }

    stu(stu s){ // copy constructor
        name = s.name;
        age = s.age;
    }

    void display(){
        System.out.println(name + " is " + age + " years old");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        stu s1 = new stu("Ark", 21);
        stu s2 = new stu(s1);

        s2.display();
    }
}
