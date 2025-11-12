package OOPS;
class Animals{
    Animals(){
        System.out.println("Animal is created.."); // Invoking parent class constructor
    }
}

class DogeshBhai extends Animals{
    DogeshBhai(){
        super(); // prints the parent class method
        System.out.println("Dog is created..");
    }
}

public class SuperKeyword3 {
    public static void main(String[] args) {
        DogeshBhai d = new DogeshBhai();
    }
}
