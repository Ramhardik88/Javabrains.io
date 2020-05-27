package dynamicprogramming;

public class No_9_Longext_common_subSequnces
{
    public static void main(String[] args) {
        String s1="reteeeatre";
        String s2="treee";

       // System.out.println(solution_TD(s1,s2,s1.length(),s2.length()));
        System.out.println(solution_BU(s1,s2,s1.length(),s2.length()));
    }

    private static int solution_BU(String s1, String s2, int n, int m) {
        int[][] dp=new int[n+1][m+1];
        if(n==0 || m==0)
        {
            return 0;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
              if(s1.charAt(i-1)==s2.charAt(j-1))
              {
                 dp[i][j]=1+dp[i-1][j-1];
              }
              else
              {
                  dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
              }
            }
        }

        return dp[n][m];
    }

    private static int solution_TD(String s1, String s2, int n, int m) {

        Integer[][] dp=new Integer[n+1][m+1];

        if(n==0 || m==0)
        {
            return 0;
        }
        if(dp[n][m]==null)
        {
            if(s1.charAt(n-1)==s2.charAt(m-1))
            {
                dp[n][m]=1+solution_TD(s1,s2,n-1,m-1);
            }
            else
            {
                dp[n][m]=Math.max(solution_TD(s1,s2,n-1,m),solution_TD(s1,s2,n,m-1));
            }

        }
        return dp[n][m];

    }
}
