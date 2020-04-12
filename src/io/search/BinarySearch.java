package io.search;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String []str)
    {
        int[] num= {2,4,12,3,6,90,45,34,56};
        int find=2;

        Arrays.sort(num);
        System.out.println("the sorted array is: "+Arrays.toString(num));
        int result=binarySearch(num,find);
        if(result==-1)
        {
            System.out.println("element not found");
        }
        else{
            System.out.println("element is found:"+ " "+result);
        }
    }
    private static int binarySearch(int[] num, int find) {
        int l=0;
        int u=num.length-1;
        int mid=(l+u)/2;
        while(l<=u){
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
