package Leetcode_may;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection
{
    public static void main(String[] args) {
        int [][]list1={{0,2},{5,10},{13,23},{24,25}};
        int [][]list2={{1,5},{8,12},{15,24},{25,26}};

       int result[][]=(isSolution(list1,list2));
       for(int[]a :result)
       {
           System.out.println(a);

       }
    }

    private static int[][] isSolution(int[][] A, int[][] B) {
        List<int []> result= new ArrayList<>();
        int i=0;int j=0;
        while (i<A.length && j< B.length)
        {
            int []a=A[i];
            int []b=B[j];
            if(a[1]<b[0]) i++;
            else  if(b[1]<a[0])j++;
            else
            {
                int Start=Math.max(a[0],b[0]);
                int End=Math.min(a[1],b[1]);
                result.add(new int[]{Start,End});
                if(a[1]<b[1])i++;
                else if(a[1]>=b[1])j++;

            }

        }

      return result.toArray(new int[result.size()][]);

    }
}
