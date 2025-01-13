package TwoDimensionalArray;

public class fllippinngbinarymatrix {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m = arr.length, n = arr[0].length;

        // put 1 at th 0th position of every row
        for (int i=0; i<m; i++){
           if (arr[i][0] == 0 ){ // flip that row
               for (int j=0; j<n; j++){
                  if (arr[i][j]==0) arr[i][j]=1;
                  else arr[i][j]=0;
               }
           }
        }
        // flip those cols where no of 0's > 1's:
        for (int j=1; j<n; j++){
            int nofzeroes=0; int nofones=0;
            for (int i=0; i<m; i++){
                if (arr[i][j] == 0) nofzeroes++;
                else nofones++;
            }
            if (nofzeroes > nofones){
                for (int i=0; i<m; i++){
                    if (arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        // calculating the binary score:
        int score = 0;
        int x = 1;
        for (int j=n-1; j>=0; j--){
            for (int i=0; i<m; i++){
                score += (arr[i][j]*x);
            }
            x*=2;
        }
        System.out.println(score);
    }
}
