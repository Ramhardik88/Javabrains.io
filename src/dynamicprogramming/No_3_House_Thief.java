package dynamicprogramming;

public class No_3_House_Thief
{
    public static void main(String[] args) {
        int[] wealth = { 6, 7, 1, 30, 8, 2, 4 };
        int currentindex=0;

      System.out.println("The maximum wealth "+house_Theif_BottomUp(wealth));
//        System.out.println("The maximum wealth"+house_Theif_TopDown(wealth,currentindex));

    }


    private static int house_Theif_BottomUp(int[] wealth) {
        int dp[]=new int[wealth.length+2];
        dp[wealth.length]=0;

        for(int i=wealth.length-1;i>=0;i--)
        {
            dp[i]=Math.max(wealth[i]+dp[i+2],dp[i+1]);
        }
        return dp[0];
    }
}
