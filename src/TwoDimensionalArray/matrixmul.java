package TwoDimensionalArray;

public class matrixmul {
    public static void main(String[] args) {
        int[][] a = {{1,2,0},{2,1,1}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        if (a[0].length!=b.length){
            System.out.println("Multiplication not possible : ");
        }
        else { // multiplication is possible
            int[][] c = new int[a.length][b[0].length];
            for (int i=0; i<c.length; i++){
                for (int j=0; j<c[0].length;j++){
//                    c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + ...
                    for (int k=0; k<b.length;k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
