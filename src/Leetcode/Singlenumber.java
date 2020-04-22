package Leetcode;

public class Singlenumber {
    public static void main(String[] args){
        int arr[]={4,1,1,2,4};
        System.err.println(solution(arr));
    }
    public static int solution( int arr[]){
        int result=0;
        for(int num:arr){
            result=result^num;
        }
        return result;
    }
}
