package Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,-1};
        int targetsum = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetsum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
