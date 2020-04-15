package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArrayUsinghash
{

    public static void main(String []args){
        int []num={1,0,0,1,0,1,0,1};
        int n=num.length;
        int result= fixedMaxLengthArray(num,n);
        System.out.println(result);

    }

    private static int fixedMaxLengthArray(int[] num, int n) {
        Map<Integer,Integer> mymap=new HashMap<>();
        mymap.put(0,-1);
        int sum=0;
        int maxlengh=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                sum=sum-1;
            }
            else {
                sum=sum+1;
            }
            if(mymap.containsKey(sum)){
                maxlengh=Math.max(maxlengh,i-mymap.get(sum));
                System.out.println(maxlengh);
            }
            else {
                mymap.put(sum,i);
            }
        }

        return maxlengh;
    }



}
