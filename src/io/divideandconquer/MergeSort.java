package io.divideandconquer;

public class MergeSort 
{
    public static void main(String args[])
    {
        int arr[]={12,45,23,11,5,1,6,3,90,404,506,123,4532,756,8903,15,9};
        int l=0;
        int r=arr.length-1;
        int []result=mergeSort(arr,l,r);

        for(int i:result)
        {
            System.out.print(i+" ");
        }
    }

    private static int[] mergeSort(int[] arr, int l, int r) {
        if(l<r)
        {
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r)
    {
        int i=l,j=m+1,k=l;
        int temp[] = new int[17];//create the array for temp size canbe change

        while (i<=m && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                i++;k++;
            }
            else
            {
                temp[k]=arr[j];
                j++;k++;
            }
        }
        while (i<=m)
        {
            temp[k]=arr[i];
           i++; k++;
        }
        while (j<=r)
        {
            temp[k]=arr[j];
            j++;k++;
        }

        for(int p=l;p<=r;p++)
        {
            arr[p]=temp[p];
        }

    }
}
