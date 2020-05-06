package dynamicprogramming;

public class No_2_NumberFactor {

    public static void main(String[] args) {

        int n=5;
        //System.out.println(numberFactor_topDown(n));
        System.out.println(numberFactor_Buttomup(n));
    }

    private static int numberFactor_Buttomup(int n) {
        int dp[]=new int[n+1];

        dp[0]=dp[1]=dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-3]+dp[i-4];
        }
        return dp[n];
    }

    private static int numberFactor_topDown(int n) {

        int dp[]=new int[n+1];

        if(n==0 || n==1 || n==2)
            return 1;
        if(n==3)
            return 2;
        if(dp[n]==0)
        {
            int num1=numberFactor_topDown(n-1);
            int num2=numberFactor_topDown(n-3);
            int num3=numberFactor_topDown(n-4);

            dp[n]=num1+num2+num3;

        }
        return dp[n];
    }
}
