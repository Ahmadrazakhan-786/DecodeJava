package OOPS;

class Student{
    int rno;
    String name;
    String course;

    void display(){
        System.out.println(name);
    }
}
public class classes {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "ahmad";
        s.rno = 60;
        s.course  =  "cse";
        s.display();
    }
}
