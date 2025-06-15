package OOPS;

class students{
    String name;
    int marks;

    students(String n, int m){
        name = n;
        marks = m;
    }

    void display(){
        System.out.println(name + "got"+ marks + "marks");
    }

}
public class ParametrizedConstructor {
    public static void main(String[] args) {
        students s = new students("Ahmad",95);
        s.display();
    }
}
