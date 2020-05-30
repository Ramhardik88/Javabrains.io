package Array;

public class MaxSumSubArray
{
    public static void main(String[] args) {
        int nums[]={1,9,-1,-2,7,3,-1,2};
        int  k=4;

        System.out.println(  isSolution(nums,k));
    }

    private static int isSolution(int[] nums, int k) {
        int start=0;int end=0;
        int maxsum=0;
        int windowsum=0;

        while (end<k)
        {
            windowsum+=nums[end++];
        }
        while (end<nums.length)
        {
            windowsum+= nums[end++]-nums[start++];
            maxsum=Math.max(windowsum,maxsum);
        }
        return maxsum;

    }
}
