package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray
{
    public static void main(String[] args) {
        int arr[]={0,1};
        System.out.println( isSolution(arr));
    }

    private static int isSolution(int[] arr) {
        int sum=0;
        int maxLength=0;
        Map<Integer,Integer> hash= new HashMap<>();
        hash.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum=sum-1;
            }
            else {
                sum=sum+1;
            }
            if(hash.containsKey(sum))
            {
                maxLength=Math.max(maxLength,i-hash.get(sum));

            }
            else
            {
                hash.put(sum,i);
            }
        }
        return maxLength;
    }
}
