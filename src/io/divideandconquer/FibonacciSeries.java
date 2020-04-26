package io.divideandconquer;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        int limit=10;

        for(int i=0;i<limit;i++)
        {
            System.out.println(finonacci(i));
        }
    }

    private static int  finonacci(int i) {
        if(i==0) return 0;
        else if(i==1) return 1;
        return finonacci(i-1)+finonacci(i-2);
    }
}
