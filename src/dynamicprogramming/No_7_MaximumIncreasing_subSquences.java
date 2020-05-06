package dynamicprogramming;

public class No_7_MaximumIncreasing_subSquences
{
    public static void main(String[] args) {

        int array[]={7,1,4,8,11,2,14,3};
        System.out.println( solution_BU(array));
    }

    private static int solution_BU(int[] array) {

        int dp[]=new int[array.length];

        for(int i=0;i<array.length;i++)
        {
            dp[i]=array[i];
        }
        int maxSubsequences=array[0];

        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(array[i]>array[j] &&  array[i]+dp[j]>dp[i])
                {
                    dp[i]=array[i]+dp[j];

                    maxSubsequences=Math.max(maxSubsequences,dp[i]);
                }
            }
        }
        return maxSubsequences;
    }
}
