package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i=0; i<arr.length; i+=2){
            if (i==arr.length-1) break; // edge case for odd no. of ele : agar idx last ele pe hai
            int temp = arr[i]; //  to kisi ke saath swap nhi kar paaega to jaise idx last ele pe pahucha break kar do
            arr[i]  = arr[i+1];
            arr[i+1] = temp;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
