package Sorting;

public class checkifArrayisSortedorNot {
    public static void main(String[] args) {
        int[] arr = {1,5,7,60,200,400,1200};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for (int i=0; i<n-1; i++){ // n-1 isliye qki last ele ko kisi ke sath compare nhi krna tha
            if (arr[i] > arr[i+1]){
                flag = false; // false means unsorted
                break;
            }
        }
        if (flag == true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
