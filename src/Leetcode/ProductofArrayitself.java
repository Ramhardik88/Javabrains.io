package Leetcode;

import java.util.Arrays;

public class ProductofArrayitself
{


    public static void main(String []args)
    {
        int nums[]={1,2,3,4};

      System.out.println(Arrays.toString(  productExceptself( nums)));

    }

    private static int[] productExceptself(int[] nums) {
        int N=nums.length;

        int[] output=new int[N];
        output[0]=1;


        for (int i=1;i<N;i++)
            output[i]=nums[i-1]*output[i-1];

        int R=1;
        for(int i=N-1;i>=0;i--)
        {
            output[i]=output[i]*R;
            R=R*nums[i];

        }


        return output;
    }
}
