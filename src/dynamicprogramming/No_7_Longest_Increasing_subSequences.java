package dynamicprogramming;

public class No_7_Longest_Increasing_subSequences
{
    public static void main(String[] args) {
        int array[]={7,1,4,2,8,10,14,3};
        System.out.println(solution_BU(array));
    }

    private static int solution_BU(int[] array) {
      int dp[]=new int[array.length];

      for(int i=0;i<array.length;i++)
      {
          dp[i]=1;
      }
        int maxLength=1;
      for(int i=1;i<dp.length;i++)
      {
          for(int j=0;j<i;j++)
          {
              if(array[i]>array[j] && dp[j]+1>dp[i])
              {
                  dp[i]=dp[j]+1;

                  maxLength= Math.max(maxLength, dp[i]);
              }
          }
      }
        return maxLength;
    }
}
