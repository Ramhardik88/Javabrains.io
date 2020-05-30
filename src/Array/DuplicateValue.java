package Array;

import java.util.*;

public class DuplicateValue
{
    public static void main(String[] args) {
        int arr[]={2,1,3,1,4};
        System.out.println( solution(arr));

    }

    private static int solution(int[] arr) {
        if(arr.length<=1)
        {
            return -1;

        }
        int i=0;
        while (i<arr.length)
        {
            if(arr[i]!=arr[arr[i]-1])
            {
                int OtherIndex=arr[i]-1;

                int x=arr[i];
                arr[i]=OtherIndex;
                arr[OtherIndex]=x;


            }
            else {
                i++;
            }
        }
      return arr[arr.length-1];

    }
}
