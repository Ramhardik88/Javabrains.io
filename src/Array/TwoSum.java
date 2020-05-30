package Array;

public class TwoSum
{
    public static void main(String[] args) {
        int nums[]={-3,2,3,3,6,8,15};
        int target=6;

        int result[]=isSOlution(nums,target);
        for(int i:result)
        {
            System.out.print("i = " + i);
        }

    }

    private static int[] isSOlution(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int arr[]=new int[2];

        while (start<end)
        {
           int sum=nums[start]+nums[end];
            if(sum==target)
            {
             arr[0]=start+1;
             arr[1]=end+1;
             break;
            }
            else if(start<target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return arr;
    }
}
