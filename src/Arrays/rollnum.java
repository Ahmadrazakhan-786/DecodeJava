package Arrays;

public class rollnum {
    public static void main(String[] args) {
        int[] arr = {75,45,30,12,4,32,-5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 35)
                System.out.print(i + " ");
        }
    }
}
