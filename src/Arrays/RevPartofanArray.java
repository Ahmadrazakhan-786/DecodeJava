package Arrays;

public class RevPartofanArray {
    public static void main(String[] args) {
        int[] arr = {50, 60, 75, 85, 96,5};
        int i = 1; int j = 4;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
