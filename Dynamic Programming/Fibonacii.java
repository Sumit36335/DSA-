import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] dp = new int[n+1];
    Arrays.fill(dp,-1);
    System.out.println(fibMem(n,dp));
    System.out.println(fibTab(n));
 }
 // memoization
public static int fibMem(int n,int [] dp)
{
    if(n==0||n==1)
    {
        return n;
    }
    if(dp[n]!=-1)
    {
        return dp[n];
    }
    int first= fibMem(n-1,dp);
    int second= fibMem(n-2,dp);
    dp[n]=first+second;
    return dp[n];
}
// tabulation
public static int fibTab(int n)
{
    int[] dp= new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}
 // space optimisation
  public static int fibTab(int n)
{
    
    prev1=0;
    prev2=1;
    for(int i=2;i<=n;i++)
    {
        int curr=prev1+prev2;
        prev1=prev2;
        prev2=curr;
    }
    return prev2;
}
}
