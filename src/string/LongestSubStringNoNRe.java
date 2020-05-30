package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringNoNRe
{
    public static void main(String[] args) {
        String s="bccbababd";
        System.out.println(isSolution(s));
    }

    private static int isSolution(String s) {
        int start=0;
        int end=0;
        int maxlength=0;
        Map<Character, Integer> map = new HashMap<>();
        if(s==null || s.length()==0)
        {
            return -1;
        }
        while (end<s.length())
        {
            char endChar=s.charAt(end);
            if(map.containsKey(endChar))
            {
                start= Math.max(end-start+1,map.get(endChar)+1);
            }
            map.put(endChar,end);

            maxlength= Math.max(maxlength,end-start+1);
            end++;
        }
        return maxlength;
    }
}
