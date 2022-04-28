import java.io.*;
import java.util.*;

public class Main
{
  // recursive
    public static int solveRecursive(int n)
    {
        if(n==0) return 1;
        int ans1 =  (n-1>=0) ? solveRecursive(n-1) : 0;
        int ans2 =  (n-2>=0) ? solveRecursive(n-2) : 0;
        int ans3 =  (n-3>=0) ? solveRecursive(n-3) : 0;
         
        return ans1+ans2+ans3;
    }
  // memoization
    public static int solveMemoization(int n,int[] dp)
    {
        if(n==0) return 1;
        if(dp[n] != -1) return dp[n];
        int ans1 =  (n-1>=0) ? solveMemoization(n-1,dp) : 0;
        int ans2 =  (n-2>=0) ? solveMemoization(n-2,dp) : 0;
        int ans3 =  (n-3>=0) ? solveMemoization(n-3,dp) : 0;
        dp[n]= ans1+ans2+ans3;
        return dp[n];
    }
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(solveRecursive(n));
        // int[] dp= new int[n+1];
        // Arrays.fill(dp,-1);
        // System.out.println(solveMemoization(n,dp));
      
      
      // tabulation
        int [] dp= new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int ans1 =  (i-1>=0) ? solveMemoization(i-1,dp) : 0;
            int ans2 =  (i-2>=0) ? solveMemoization(i-2,dp) : 0;
            int ans3 =  (i-3>=0) ? solveMemoization(i-3,dp) : 0;
            dp[i]=ans1+ans2+ans3;
        }
        System.out.println(dp[n]);
    }
}
