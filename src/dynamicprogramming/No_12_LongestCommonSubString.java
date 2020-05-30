package dynamicprogramming;

public class No_12_LongestCommonSubString
{
    public static void main(String[] args) {
        String s1="JAVAAID";
        String s2="JAVAID";
        int m=s1.length();
        int n=s2.length();
        System.out.println(  isSolution(s1.toCharArray(),s2.toCharArray() ,m,n));
    }
      //time=o(m*n)
      //space=o(m*n)
    private static int isSolution(char[] x, char[] y, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        int result=0;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(x[i-1]==y[j-1])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    result =Math.max(result,dp[i][j]);
                }
                else {
                    dp[i][j]=0;
                }
            }
        }
        return result;
    }


}
