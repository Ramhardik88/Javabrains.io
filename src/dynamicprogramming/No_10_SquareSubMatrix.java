package dynamicprogramming;

import java.security.spec.RSAOtherPrimeInfo;

public class No_10_SquareSubMatrix
{
    public static void main(String[] args) {
        int matrix[][]={
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}};

        System.out.println(solution(matrix));
    }

    private static int solution(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        int dp[][]=new int[n][m];
        for(int i=0 ;i<m;i++)  // for row;
        {
            dp[0][i]=matrix[0][i];
            count+=dp[0][i];
        }
        for(int i=1;i<n;i++)  // for col;
        {
            dp[i][0]=matrix[i][0];
            count+=dp[i][0];
        }

        for(int i=1; i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));

                }
                count+=dp[i][j];

            }
        }

        return count;
    }
}
