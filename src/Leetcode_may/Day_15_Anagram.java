package Leetcode_may;

import java.util.ArrayList;
import java.util.List;

class Day_15_Anagram
{
    public static void main(String[] args) {
        String s="abbacda";
        String p="ab";

        System.out.println(solution(s,p));
    }

    private static List<Integer> solution(String s, String p) {
        List<Integer> result=new ArrayList<>();

        int slen=s.length();
        int plen=p.length();

        if(p== null || plen==0 || slen<plen)
        {
            return result;
        }

        int parr[]=new int[26];
        int sarr[]=new int[26];

        for(int i=0;i<p.length();i++)
        {
            parr[p.charAt(i)-'a']++;
            sarr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<slen-plen;i++)
        {
            if(isAnagram(parr,sarr))
            {
                result.add(i);
            }
            sarr[s.charAt(i)-'a']--;
            sarr[s.charAt(i+plen)-'a']++;
        }

       if(isAnagram(parr,sarr))
       {
           result.add(slen-plen);
       }
       return result;
    }

    private static boolean isAnagram(int[] parr, int[] sarr) {
        for(int i=0;i<parr.length;i++)
        {
            if(parr[i]!=sarr[i])
            {
                return false;
            }

        }
        return true;
    }

}