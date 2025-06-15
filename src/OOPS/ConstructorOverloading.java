package OOPS;

class school{
    String name;
    int marks;

    school(){
        name = "unknown";
        marks = 65;
    }

    school(String n, int m){
        name = n;
        marks = m;
    }

    void display(){
        System.out.println(name + " got " + marks + " marks.");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        school s2 = new school("khan",75);
        school s1 = new school();

        s1.display();
        s2.display();

    }
}
