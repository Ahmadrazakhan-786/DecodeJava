package Methods;

public class returnKeyword {
    public  static void fun(int x){
       if (x < 0) return;
        System.out.println("hiii");
    }
    public static void main(String[] args) {
        fun(-1);
    }
}
