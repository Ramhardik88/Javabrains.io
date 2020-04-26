package io.divideandconquer;

public class QuickSort
{
    public static void main(String[]args)
    {
        int nums[]={7,9,3,2,6,56,234,21,34,65,123,45,908,783,567,1231};
        int s=0;
        int e=nums.length-1;
        int []result=quickSort(nums,s,e);
        for(int i:result)
        {
            System.out.print(i+" ");
        }
    }

    private static int[] quickSort(int[] nums, int s, int e)
    {
        if(s<e)
        {
            int p=partition(nums,s,e);
            quickSort(nums,s,(p-1));
            quickSort(nums,(p+1),e);
        }

        return nums;
    }

    private static int partition(int[] nums, int s, int e)
    {
        int pivot=nums[e];
        int pindex=0;

        for(int i=0;i<e;i++)
        {
            if(nums[i]<pivot)
            {                            //swap
                 int temp=nums[i];
                 nums[i]=nums[pindex];
                 nums[pindex]=temp;
                 pindex++;
            }
        }
        int temp=nums[e];                       //swap
        nums[e]=nums[pindex];
        nums[pindex]=temp;

        return pindex;
    }




}
