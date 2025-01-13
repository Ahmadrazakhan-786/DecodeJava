package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {75,-36,22,8,58,10,7,-786};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) min = arr[i];
        }
        System.out.println(min);
    }
}
