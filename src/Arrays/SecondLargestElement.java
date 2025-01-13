package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {50, 607, -75, 99, 3};

        // method-1:
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > mx) mx = arr[i]; // ye v likh skte ho
             mx = Math.max(mx,arr[i]); // ya ye v
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != mx)
                smx = Math.max(smx,arr[i]);
        }
//        System.out.println(mx);
        System.out.println(smx);
    }
}