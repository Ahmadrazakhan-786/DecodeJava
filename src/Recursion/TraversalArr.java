package Recursion;

public class TraversalArr {
    public static void print(int i, int[] arr){
        if (i== arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {7,5,2,1,7,0};
        print(0,arr);
    }
}
