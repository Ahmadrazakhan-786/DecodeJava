package TwoDimensionalArray;

public class Sumin2D {
    public static void main(String[] args) {
        int[][] arr = {{4,12,50},{7,-2,5},{4,5,6,}};
        int m = arr.length;;
        int n = arr[0].length;

        int sum = 0;
        int mul = 1;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                sum += arr[i][j];
                mul *= arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
