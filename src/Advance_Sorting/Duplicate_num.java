package Advance_Sorting;

public class Duplicate_num {
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,2};
        while(true){
            int ele = arr[0];
            if(arr[ele] == ele){
                System.out.println(ele);
                break;
            }
             else swap(0,ele,arr);
        }
    }
}
