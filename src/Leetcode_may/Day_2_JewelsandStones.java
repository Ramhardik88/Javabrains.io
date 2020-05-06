package Leetcode_may;

public class Day_2_JewelsandStones
{
    public static void main(String[] args) {
        String j="aA";
        String s="aAAbbbb";

        System.out.println(jewelsAndStones(j,s));
    }

    private static int jewelsAndStones(String j, String s) {
        int slen=s.length();
        int jlen=j.length();

        int count =0;
        for(int i=0;i<slen;i++)
        {
            for(int k=0;k<jlen;k++)
            {
                if (s.charAt(i)==j.charAt(k))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
