package Arrays;

public class passingarraytomethods {
    public static void main(String[] args) {
        int[] arr = {50,60,70,65};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr) {
        arr[0] = 90;
    }
}
