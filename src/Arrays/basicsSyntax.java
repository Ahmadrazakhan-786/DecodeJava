package Arrays;

public class basicsSyntax {
    public static void main(String[] args) {
        int [] arr = new int[5];
        // intializing inndividual array:
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 140;

        // output:
        System.out.println(arr[4]);
//        System.out.println(arr[2]);
//        System.out.println(arr[1]);
//        System.out.println(arr[3]);
        arr[3] = 99;
        arr[4] +=47;
        System.out.println(arr[3]); // updation :
        System.out.println(arr[4]);
    }
}
