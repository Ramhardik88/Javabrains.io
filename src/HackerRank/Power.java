package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Power
{
    public static void main(String[] args) {
        
        List<Integer>arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(   isPower(arr));
        
    }

    public static List<Integer> isPower(List<Integer> arr) {
        // Write your code here

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=arr.size()-1;i++)
        {
            if(i==0 && arr.get(i)!=Math.pow(2,i+1))
            {
                list.add(1);
            }
            if(arr.get(i)!=Math.pow(2, i))
            {
                list.add(0);
            }
            else
            {
                list.add(1);
            }
        }

        return list;


    }

}


