package Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {50,60,75,95,100};
        int n = arr.length;
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int i=0 , j=n-1;
        while (i<=j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }

        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
