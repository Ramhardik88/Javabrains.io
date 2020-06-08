package dynamicprogramming;

public class No_4_One_String_to_Another
{
    public static void main(String[] args) {
        String s1="great";
        String s2="create";
        int i1=0;
        int i2=0;
      //  System.out.println(oneString_to_another_TD(s1,s2,i1,i2));

        System.out.println(oneString_to_another_BU(s1,s2));

    }

    private static int oneString_to_another_BU(String s1, String s2) {

        int dp[][]=new int[s1.length()+1][s2.length()+1];

        for(int i1=0;i1<=s1.length();i1++)
        {
            dp[i1][0]=i1;
        }
        for(int i2=0;i2<=s2.length();i2++)
        {
            dp[0][i2]=i2;
        }

        for(int i1=1;i1<=s1.length();i1++)
        {
            for(int i2=1;i2<=s2.length();i2++)
            {
                if(s1.charAt(i1-1)==s2.charAt(i2-1))
                {
                    dp[i1][i2]=dp[i1-1][i2-1];
                }
                else {
                    dp[i1][i2]=1+Math.min(dp[i1-1][i2],Math.min(dp[i1][i2-1],dp[i1-1][i2-1]));
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }


    private static int oneString_to_another_TD(String s1, String s2,int i1,int i2) {
        Integer[][]dp=new Integer[s1.length()+1][s2.length()+1];


        if(dp[i1][i2]==null)
        {
            if(i1==s1.length())
            {
                dp[i1][i2]=s2.length()-i2;
            }

            else if(i2==s2.length())
            {
                dp[i1][i2]=s1.length()-i1;
            }
            else if(s1.charAt(i1)==s2.charAt(i2))
            {
                dp[i1][i2]= oneString_to_another_TD(s1,s2,i1+1,i2+1);
            }
            else {
                int number1=oneString_to_another_TD(s1,s2,i1+1,i2);
                int number2=oneString_to_another_TD(s1,s2,i1,i2+1);
                int number3=oneString_to_another_TD(s1,s2,i1+1,i2+1);
                dp[i1][i2]=1+Math.min(number1,Math.min(number2,number3));
            }

        }
        return dp[i1][i2];

    }
}
