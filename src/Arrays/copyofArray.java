package Arrays;

public class copyofArray {
    public static void main(String[] args) {
        int[] arr = {54,30,12,5,65,35};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] nums = arr; // shallow copy
        nums[0] = 32;
        System.out.println(arr[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
