package io.divideandconquer;

public class HouseThief
{
    public static void main(String str[])
    {
        int []HouseNetworth={6,7,1,30,8,2,4};
        int currentIndex=0;
        int result=housethief(HouseNetworth,currentIndex);
        System.out.println(result);
    }

    private static int housethief(int[] HouseNetWorth,int CurrentIndex)
    {
        if(CurrentIndex>=HouseNetWorth.length)
        {
            return 0;
        }

        int stealcurrentHouse=HouseNetWorth[CurrentIndex]+housethief(HouseNetWorth,CurrentIndex+2);

        int shipcurrentHouse=housethief(HouseNetWorth,CurrentIndex+1);

        return Math.max(shipcurrentHouse,stealcurrentHouse);


    }
}
