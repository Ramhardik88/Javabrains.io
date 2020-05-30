package Number;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args) {
        int []number=new int[]{2,3,7,4,8};
        int Target=7;
      int []result=  isSolution(number,Target);
        System.out.print(result[0]+" "+result[1]);
    }

    private static int[] isSolution(int[] number, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for(int i=0;i<=number.length;i++)
        {
            int delta=target-number[i];
            if(values.containsKey(delta))
            {
                return  new int[]{values.get(delta),i};
            }
            values.put(number[i],i);
        }
        return new int[]{-1,-1};
    }
}
