package Leetcode_may;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class String_Frequency_sort
{
    public static void main(String[] args) {
        String s="tree";
    //    System.out.print("hash map :"+solution_HashMap(s));
        System.out.println("queue : "+solution_PriorityQueue(s));
    }

    private static String solution_PriorityQueue(String s) {
        Map<Character,Integer> charCountMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->
                charCountMap.get(b)-charCountMap.get(a));

        pq.addAll(charCountMap.keySet());

        StringBuilder sb=  new StringBuilder();
         while (!pq.isEmpty())
         {
             char c=pq.remove();

             for(int i=0;i<charCountMap.get(c);i++)
             {
                 sb.append(c);
             }
         }


        return  sb.toString();
    }

    private static String solution_HashMap(String s) {

        // time o(n log n)  space o(n)
        StringBuilder sb= new StringBuilder();
        Map<Character,Integer> charCountMap=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
        }
        charCountMap.entrySet().stream()
                .sorted(Map.Entry.<Character,Integer> comparingByValue().reversed())
                .forEach(record ->{
                    Character key =record.getKey();
                    int value=record.getValue();

                    for(int i=0;i<value;i++)
                    {
                        sb.append(key);
                    }
                });
        return sb.toString();
    }

}
