package Searching;

public class threshold {
    public static void main(String[] args) {
        int[] arr = {5,1,9,2};
        int n = arr.length;
        int t = 6;
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            mx = Math.min(mx,arr[i]);
        }

        for (int d=1; d<=mx; d++){
            int sum = 0;
            for (int i=0; i<n; i++){
                if (arr[i]%d==0) sum += arr[i]/d;
                else sum += arr[i]/d + 1;
            }

            if (sum<= t)
                System.out.println(d);
        }
    }
}
