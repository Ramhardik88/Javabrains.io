package io.divideandconquer;

import java.util.Arrays;

public class BinarySearch
{
    public static void main(String []args)
    {
        int nums[]={2,12,34,11,23,56,15,89,1,45,80,45};
        int find=13;
        Arrays.sort(nums);
        System.out.println("the sorted Array is"+Arrays.toString(nums));
        int result=solution(nums,find);
        if(result==-1)
        {
            System.out.println("number not found");
        }
        else
        {
            System.out.println("number found at position"+result);
        }
    }

    private static int solution(int[] nums, int find) {
        int l=0;int u=nums.length-1;

        while(l<=u)
        {
            int mid=(l+u)/2;
            if(nums[mid]==find)
            {
                return mid;
            }
            else
            {
                if(nums[mid]<=find)
                {
                    l=mid+1;
                }
                else
                {
                    u=mid-1;
                }
            }

        }
        return -1;
    }

}
