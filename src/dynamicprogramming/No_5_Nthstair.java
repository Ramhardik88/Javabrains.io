package dynamicprogramming;

public class No_5_Nthstair {
    public static void main(String[] args) {
        int n=4;
//        System.out.println(stairUsing_TD(n));
        System.out.println(stairUsing_BU(n));
    }

    private static int stairUsing_BU(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }

    private static int stairUsing_TD(int n) {
       int dp[]=new int[n+1];

       if(n==0) return 1;
       if(n==1) return 1;
       if(n==2) return 2;
       if(dp[n]==0)
       {
           dp[n]=stairUsing_TD(n-1)+stairUsing_TD(n-2)+stairUsing_TD(n-3);
       }

      return dp[n];
    }
}
