package dynamicprogramming;

public class No_6_Nth_Minimum_Stair {
    public static void main(String[] args) {
        int n=7;
       System.out.println(solution_TD(n));
        System.out.println(solution_BU(n));
    }

    private static int solution_BU(int n) {
      int dp[]=new int[n+1];
      dp[0]=0;
      dp[1]=1;
      dp[2]=2;

      for(int i=3;i<=n;i++)
      {
          dp[i]=1+Math.min(dp[i-1],Math.min(dp[i-2],dp[i-3]));
      }
      return dp[n];
    }

    private static int solution_TD(int n) {
        int dp[]=new int[n+1];

        if(n==0)
            return 0;
        if(n==1 || n==2 || n==3)
        {
            return 1;
        }
        if(dp[n]==0)
        {
            dp[n]=1+Math.min(solution_TD(n-1),Math.min(solution_TD(n-2),solution_TD(n-3)));
        }
        return dp[n];
    }
}
