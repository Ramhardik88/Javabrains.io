package Leetcode_may;

public class Day_4_NumberComplement
{
    public static void main(String[] args) {
        int num=5;
        System.out.println(findComplement(num));
    }

    private static int findComplement(int num) {

        int temp=num;
        int bit=1;
        while(temp!=0)
        {
            num=num^bit;
            bit=bit<<1;
            temp=temp>>1;
        }
        return num;
    }
}
