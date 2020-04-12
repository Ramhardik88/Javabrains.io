package io.search;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String []str)
    {
        int[] num= {7,45,12,13,83,567,1234,23,6773,4,67859};
        int find=567;
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int result=binarySearch(num,find);
        if(result==-1)
        {
            System.out.println("element not found");
        }
        else{
            System.out.println("element is found:"+" "+result);
        }
    }
    private static int binarySearch(int[] num, int find) {
        int l=0;
        int u=num.length-1;

        while(l<=u){
            int mid=(l+u)/2;
            if(num[mid]==find)
            {
                return mid;
            }
            else
                if(num[mid]<=find)
                {
                    l=mid+1;

                }
                else
                {
                    u=mid-1;

                }
        }
        return -1;
    }
}
