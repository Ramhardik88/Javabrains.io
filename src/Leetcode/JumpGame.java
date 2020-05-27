package Leetcode;

public class JumpGame {
    public static void main(String []args)
    {
        int num[]={1,2,1,0,2};
        System.out.println(jumpgame(num));
    }

    private static boolean jumpgame(int[] num) {
        int n=num.length;
        int reachable=0;

        for(int i=0;i<n;i++)
        {
            if(reachable<i)
            {
                return false;
            }
            reachable=Math.max(reachable,i+num[i]);
        }
        return true;
    }
}
