package Leetcode_may;

public class Day_8_PerfectSquare
{
    public static void main(String[] args) {
        int num=16;
      //  System.out.println(isBoolean(num));
        System.out.println(isBruteforce(num));
    }
// time complexity--> o(root(n))
    private static boolean isBruteforce(int num) {
        if(num<2)
        {
            return true;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(i*i==num)
            {
                return true;
            }
            else if(i*i>num)
            {
                return false;
            }
        }
        return false;
    }

    //time complexity is  n(log(root(n))
                          //==n

    private static boolean isBoolean(int num) {

        if(num<2)
        {
            return true;
        }

        long start=2;
        long end=num/2;

        while(start<=end)
        {
            long mid=start+(end-start)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return false;
    }

    }
