package string;

import java.util.HashMap;
import java.util.Map;

public class SubStringKdistinct
{
    public static void main(String[] args) {
        String s="bccbababd";
        int k=2;

        System.out.println(isSolution(s,k));

    }

    private static int isSolution(String s, int k) {

        if(s==null|| s.length()==0 || k<=0|| k>s.length())
        {
            return -1;
        }
        int maxlength=0;
        int start=0;int end=0;
        Map<Character, Integer> map = new HashMap<>();

        while (end<s.length())
        {
            char endChar=s.charAt(end);
             map.put(endChar,map.getOrDefault(endChar,0)+1);
             while(map.size()>k)
             {
                 char StartChar=s.charAt(start);// start char enter into map
                 map.put(StartChar,map.get(StartChar)-1);

                 if(map.get(StartChar)==0)
                 {
                     map.remove(StartChar);
                 }
                 start++;

             }
             maxlength=Math.max(maxlength,end-start+1);
           end++;
        }
    return maxlength;

    }
}
