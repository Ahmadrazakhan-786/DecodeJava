package TwoDimensionalArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{40,52,13,14},{54,78,96,15},{19,81,72,75}};
        int m = arr.length;
        int n = arr[0].length;
        int minrow = 0, maxrow = m-1, mincol = 0, maxcol = n-1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Spiral-Matrix:
        while (minrow <= maxrow && mincol <= maxcol){
            // Left to Right:
            for (int j=mincol; j<=maxcol; j++){
                System.out.print(arr[minrow][j] + " ");
            }
            minrow++;
            // Top to Bottom:
            if (minrow > maxrow || mincol > maxcol) break;
            for (int i=minrow; i<=maxrow; i++){
                System.out.print(arr[i][maxcol] + " ");
            }
            maxcol--;
            // Right to Left:
            if (minrow > maxrow || mincol > maxcol) break;
            for (int j=maxcol; j>=mincol; j--){
                System.out.print(arr[maxrow][j] + " ");
            }
            maxrow--;
            // Bottom to Top:
            if (minrow > maxrow || mincol > maxcol) break;
            for (int i=maxrow; i>=minrow; i--){
                System.out.print(arr[i][mincol] + " ");
            }
            mincol++;
        }
    }
}
