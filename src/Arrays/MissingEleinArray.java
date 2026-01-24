package Arrays;

public class MissingEleinArray {
    public static void main(String[] args) {
        long[] arr = {1,2,3,5};
        long n = arr.length+1; // 1 to n tak numbers honge arr me
        long sum = n*(n+1)/2; // long isliye liya n*n bahut badi no. ban jaati jo ki int me store nhi ho pati
        long arrSum = 0;
        for (int i=0; i<arr.length; i++){
            arrSum += arr[i];
        }
        System.out.print (sum-arrSum);
    }
}
