package dynamicprogramming;

public class No_11_UncrossedLines
{
    public static void main(String[] args) {
        int []list1={2,3,2,4};
        int []list2={2,4,3,4};
        System.out.println(isSolution(list1,list2));
    }

    private static int isSolution(int[] list1, int[] list2) {
        int len1 = list1.length;
        int len2 = list2.length;

        int [][]dp=new int[len1+1][len2+1];

        for (int i = 0; i <= len1; i++)
        {
            for(int j=0;j<=len2;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(list1[i-1]==list2[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }

}
