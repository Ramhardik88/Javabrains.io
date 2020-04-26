package Leetcode;

public class SubArraySum
{
    public static  void main(String []args)
    {
        int nums[]={10,2,-2,-30,10};
        int key=-20;
       System.out.println( subarraySum(nums,key));
    }

    private static int  subarraySum(int[] nums, int key) {
        int count=0;
        for(int start=0;start<nums.length;start++)
        {
            int sum=0;
            for(int end=start;end<nums.length;end++)
            {
                sum=sum+nums[end];
                if(sum==key)
                    count++;
            }
        }
        return count;
    }
}
