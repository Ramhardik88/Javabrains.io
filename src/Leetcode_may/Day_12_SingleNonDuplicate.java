package Leetcode_may;

import java.util.HashMap;
import java.util.Map;

public class Day_12_SingleNonDuplicate
{
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(isSolution(nums));
        System.out.println(isDifferentSolution(nums));
        System.out.println(isBinarySolution(nums));
    }

    private static int isBinarySolution(int[] nums) {
        int high=nums.length-1;
        int low=0;
        int mid;

      if(high==0) return nums[0];
      else if(nums[0]!=nums[1]) return nums[0];

      else if(nums[high]!=nums[high-1]) return nums[high];

      while (low<=high)
      {
          mid=low+(high-low)/2;

          if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
          {
              return nums[mid];
          }
          if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
          {
              low=mid+1;
          }
          else
              high=mid-1;
      }
      return -1;

    }

    private static int isDifferentSolution(int[] nums) {   //o(n)
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        int i=0;
        while (i<nums.length-1)
        {
            if(nums[i]!=nums[i+1])
            {
                return i;

            }
            i=i+2;
        }
        return nums[i];
    }

    private static int isSolution(int[] nums) {                  //o(n)
        int result=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            result=result^nums[i];

        }
        return result;
    }

}
