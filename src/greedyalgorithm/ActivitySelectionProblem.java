package greedyalgorithm;

import java.util.Arrays;

public class ActivitySelectionProblem {
    public static void main(String []args){
        int start[] = {0,3,1,5,5,8};
        int finish[] = {6,4,2,8,7,9};
        int n = start.length;
        Arrays.sort(finish);
        System.out.println("the start   time    array is"+Arrays.toString(start));
        System.out.println("the sorted finish time Array"+Arrays.toString(finish));
        selectionproblem(start,finish,n);

    }
    public static void selectionproblem(int[] start,int finish[],int n ){
        System.out.println("the following activities are selected");
        int i=0;
        System.out.println(i+" ");
        for(int j=1;j<n;j++){
            if(start[j]>=finish[i]){
                System.out.println(j+" ");
                i=j;
            }
        }

    }
}
