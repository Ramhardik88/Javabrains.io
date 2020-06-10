package Leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsSubsequence {

    public static void main(String[] args) {
        String s="abc";
        String t="asdbcbaar";
       // System.out.println(isSolution(s,t));
        System.out.println(isSolutionRecursive(s,t));
    }

    private static boolean isSolutionRecursive(String s, String t) {
        return recursivehelper(s,t,0,0);
    }

    private static boolean recursivehelper(String s, String t, int sindex, int tindex)
    {
        if(s.length()==sindex)
        {
            return true;
        }
        if(t.length()==tindex)
        {
            return false;
        }
        return s.charAt(sindex)==t.charAt(tindex)?recursivehelper(s,t,sindex+1,tindex+1)
                :recursivehelper(s,t,sindex,tindex+1);
    }

    private static boolean isSolution(String s, String t) {
        int slen=s.length();
        int tlen=t.length();

        if(slen==0)
        {
            return true;
        }
        int sIndex=0;
        int tIndex=0;

        while (sIndex<slen && tIndex < tlen)
        {
            if(s.charAt(sIndex)==t.charAt(tIndex))
                sIndex++;
            tIndex++;
        }
        return sIndex==slen;

    }
}