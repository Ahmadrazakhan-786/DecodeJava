package OOPS;
class bacche{
    private String name;
    private int age;

    // Getter method
    public String getName(){
        return name;
    }

    // Setter method
    public void setName(String Newname){
        name = Newname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int Newage) {
        if (Newage > 0) {
            age = Newage;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        bacche s = new bacche();
        s.setName("Ahmad");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
