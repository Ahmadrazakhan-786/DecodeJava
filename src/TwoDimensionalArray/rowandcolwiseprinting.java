package TwoDimensionalArray;

public class rowandcolwiseprinting {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{5,7},{4,8}};
        int m = arr.length;
        int n = arr[0].length;

        // row-wise printing : simply printing the 2D array:
//        for (int i=0; i<m; i++){
//            for (int j=0; j<n; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }

        // column-wise printing : it will give you the transpose of the matrix:
//        for (int j=0; j<n; j++){ // cols
//            for (int i=0; i<m; i++){ // rows
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // storing in one matrix:
        int[][] transpose = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
