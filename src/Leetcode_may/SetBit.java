package Leetcode_may;

public class SetBit
{
    public static void main(String[] args) {
        int num=5;
      //  int[] arr=isCountBit(num);
        int[] arr=isNoofBit(num);
        for(int i:arr)
        {
            System.out.print(i +" ");
        }

    }

    private static int[] isCountBit(int num) {
        int result[]=new int[num+1];
        for(int i=0;i<=num;i++)
        {
            result[i]=combine(num);
        }
        return result;
    }

    private static int combine(int num) {
        int count=0;
        while (num!=0)
        {
            if(num%2==1)
            {
                count++;
            }
            num=num/2;
        }
        return count;
    }

    private static int[] isNoofBit(int num) {
        if(num==0) return new int[1];
        int[] result=new int[num+1];
        result[1]=1;
        for(int i=2;i<=num;i++)
        {
            result[i]= result[i/2]+ (i%2==0?0:1);
        }
        return result;

    }
}
