package TwoDimensionalArray;

public class sumoftwoarray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{74,80,5},{50,45,16}};
        int[][] b = {{10,27,31},{4,0,5},{5,45,6}};
        int m = a.length;
        int n = a[0].length;
        int[][] res = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
