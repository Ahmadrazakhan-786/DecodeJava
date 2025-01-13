package Arrays;

public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {75,45,30,12,4,32,-5};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
