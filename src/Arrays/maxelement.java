package Arrays;

public class maxelement {
    public static void main(String[] args) {
        int[] arr = {50,607,-75,99,3};

        // method-1:
//        int mx = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]>mx) mx = arr[i];

        // metthod-2:
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) mx = arr[i];
           }
        System.out.println(mx);
        }
    }

