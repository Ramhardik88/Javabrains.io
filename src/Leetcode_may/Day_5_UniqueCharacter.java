package Leetcode_may;

import java.util.HashMap;

public class Day_5_UniqueCharacter
{
    public static void main(String[] args) {

        String s="ramyaa";
        //System.out.println(uniqueCharacter(s));
        System.out.println(firstUniqueCharacter(s));
    }

    private static int firstUniqueCharacter(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int count=hash.get(ch);
            if(count==1)
            {
                return i;
            }
        }
        return -1;
    }

    //brutu force method;
    private static int uniqueCharacter(String s) {

        for(int i=0;i<s.length();i++)
        {
            int count=1;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count==1)
            {
                return i;
            }
        }
        return -1;
    }
}
