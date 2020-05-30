package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAndDuplicate
{
    public static void main(String[] args) {
        int arr[]={2,6,4,4,3,2};
        int n=arr.length;
        System.out.println( isSolution(arr,n));

    }

    private static List<List<Integer>> isSolution(int[] arr, int n) {
        Arrays.sort(arr);

        List<Integer> missing = new ArrayList<>();
        List<Integer> duplicate= new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                missing.add(i+1);
                duplicate.add(arr[i]);
            }

        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(missing);
        result.add(duplicate);

        return result;

    }
}
