package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Power2
{
    public static void main(String[] args) {
        Integer arr[]={2,5,3,4,10};
        List<Integer>num=new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println( isSolu(num));
    }

    private static List<Integer> isSolu(List<Integer> num) {
        ArrayList<Integer> h=new ArrayList<>();
        for(int i:num)
        {

            if(isPowerOfTwo(i))
                h.add(1);
            else
                h.add(0);
        }
        return  h;
    }

    private static boolean isPowerOfTwo(int n) {
        if(n==0)
        {
            return false;
        }

        return Math.ceil((Math.log(n)/Math.log(2)))==Math.floor((Math.log(n)/Math.log(2)));
//      while (n!=0)
//      {
//          if(n%2!=0)
//          {
//              return false;
//          }
//          n=n/2;
//      }
//      return false;
    }
}
