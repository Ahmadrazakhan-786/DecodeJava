package Methods;

public class min {
    public static void main(String[] args) {
        int minimum = Min(10,4);
        System.out.println(minimum);
    }
    public static int Min(int a, int b){
        if (a<b){
            return a;
        }
        else return b;

    }
}
