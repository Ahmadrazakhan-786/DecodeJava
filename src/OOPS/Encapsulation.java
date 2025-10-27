package OOPS;
//class bacche{
//    private String name;
//    private int age;
//
//    // Getter method
//    public String getName(){
//        return name;
//    }
//
//    // Setter method
//    public void setName(String Newname){
//        name = Newname;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int Newage) {
//        if (Newage > 0) {
//            age = Newage;
//        }
//    }
//}

public class Encapsulation {
    public static void main(String[] args) {
//        bacche s = new bacche();
//        s.setName("Ahmad");
//        s.setAge(21);
//
//        System.out.println(s.getName());
//        System.out.println(s.getAge());

        // new:
        bachhu b = new bachhu();
        b.setName("khan");
        b.setAge(20);
        b.setRoll(60);
        System.out.println(b.getAge()); // we uses print statement bcz we had return them
        System.out.println(b.getName());
        System.out.println(b.getRoll());

    }
}
class bachhu{
    private String name;
    private int age;
    private int roll;

    public String getName(){ // getter method
        return name;
    }
    public int getAge(){ // getter method
        return age;
    }
    public int getRoll(){ // getter method
        return roll;
    }

    public void setName(String name){ // setter method
        this.name = name;
    }
    public void setAge(int age){ // setter method
        this.age = age;
    }
    public void setRoll(int roll){ // setter method
        this.roll = roll;
    }
}