package io.sort;

public class Shellsort
{
    public static void main(String []args)
    {
        int arr[]={170,75,802,90,66,2,24,45,7};

        int n=arr.length;
        int result[]=solution(arr,n);

        for(int i:result)
        {
            System.out.print(i+" ");
        }


    }

    private static int[] solution(int[] arr, int n) {
        int gap=0;
        for(gap=n/2;gap>0;gap/=2)
        {
            for(int j=gap;j<n;j+=1)
            {
                int temp=arr[j];
                int i=0;
                for(i=j;i>=gap  && arr[i-gap]>temp;i-=gap)
                {
                    arr[i]=arr[i-gap];
                }
                arr[i]=temp;
            }
        }
        return arr;
    }
}
