package HackerRank;

import java.util.*;

public class SorttheElement
{
    public static void main(String[] args) {
       Integer array[]={2,3,2,2,3,8,11,12,11,12};
       solution(array);
    }

    private static void solution(Integer[] array) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        Set<Integer> uniqueElemnts=new HashSet<>(list);

        for(int num:uniqueElemnts)
        {
            Collections.frequency(list,num);

            System.out.println(num+" ");
        }


    }
}
