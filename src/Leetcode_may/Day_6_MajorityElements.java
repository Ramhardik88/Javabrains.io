package Leetcode_may;

import java.util.Arrays;
import java.util.HashMap;

//find the majority element in the array;
public class Day_6_MajorityElements
{
    public static void main(String[] args) {
        int array[]={2,3,7,3,4};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];


    }
}
