package Dynamic_Programming;
import java.util.*;
import java.util.Scanner;

public class FriendsPairing {
    public static int pair(int n, int[] dp){
        if (n==1 || n==2) return n; // agr 1 ya 2 hi dost hai to utaa hi ways
        if (dp[n]!=-1) return dp[n]; // memoization
        return dp[n] = pair(n-1,dp) + (n-1)*pair(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
}
