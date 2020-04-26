package io.divideandconquer;
//problem statement;
//given N, count the number of ways to express N as sum of {1,3,5}


public class Number_factor
{
    public static void main(String []args)
    {
        int n=5;
        int result= waysToGetN(n);
        System.out.println(result);

    }

    private static int waysToGetN(int n) {
        if (n==0||n==1||n==2)         //{1},{1,1} base cases
        {
            return 1;
        }
        if(n==3)                //{1,1,1}{3} base case
        {
            return 2;
        }
        int num1=waysToGetN(n-1);
        int num2=waysToGetN(n-3);
        int num3=waysToGetN(n-4);

        return num1+num2+num3;
    }
}
